class PersonEx(
    val firstName: String,
    val lastName: String
): Comparable<PersonEx> {
    override fun compareTo(other: PersonEx): Int {
        return compareValuesBy(this, other, PersonEx::lastName, PersonEx::firstName)
    }
}