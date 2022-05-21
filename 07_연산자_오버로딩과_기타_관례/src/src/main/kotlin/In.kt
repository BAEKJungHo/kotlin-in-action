import java.awt.Point

/**
 * a in c -> c.contains(a)
 */

data class Rectangle(
    val ul: Point,
    val lr: Point
)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in ul.x until lr.x
            && p.y in ul.y until lr.y
}