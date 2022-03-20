class CustomAccessor(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() { // Property Getter
            return height == width
        }

    val isNotSquare: Boolean
        get() = height != width
}