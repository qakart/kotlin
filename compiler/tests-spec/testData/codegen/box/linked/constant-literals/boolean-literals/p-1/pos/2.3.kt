// HELPERS: REFLECT

/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, boolean-literals
 * PARAGRAPH: 1
 * SENTENCE: [2] These are strong keywords which cannot be used as identifiers unless escaped.
 * NUMBER: 3
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the typeConstraint.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

class A <`true`, `false`>
        where `true` : CharSequence,
              `false` : Comparable<`true`> {
    fun getValue() = false
}

annotation class B <`true`>
        where `true` : CharSequence,
              @A<List<Nothing?>> `true` : Comparable<`true`> {

}

annotation class C <`false`, `true`> where @property:C `false` : CharSequence, `true` : Comparable<`true`> {

}

fun <`false`, `true`> d(): Boolean
        where `false` : Any,
              `false` : Iterable<*>,
              `false` : Collection<*>,
              `false` : MutableCollection<*>,
              `true` : Comparable<`false`> = true

fun box(): String? {
    if (!d<MutableSet<Any>, Comparable<MutableSet<Any>>>()) return null
    if (A<String, String>().getValue()) return null

    if (!checkClassTypeParametersWithUpperBounds(
            A::class,
            listOf(
                Pair("true", listOf("kotlin.CharSequence")),
                Pair("false", listOf("kotlin.Comparable<`true`>"))
            )
        )) return null

    if (!checkClassTypeParametersWithUpperBounds(
            B::class,
            listOf(
                Pair("true", listOf("kotlin.CharSequence", "kotlin.Comparable<`true`>"))
            )
        )) return null

    if (!checkClassTypeParametersWithUpperBounds(
            C::class,
            listOf(
                Pair("false", listOf("kotlin.CharSequence")),
                Pair("true", listOf("kotlin.Comparable<`true`>"))
            )
        )) return null

    return "OK"
}
