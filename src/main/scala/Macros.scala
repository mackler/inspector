import scala.quoted._ // imports Quotes, Expr

// this is the macro definition
inline def inspect(inline x: Any): Any = ${ inspectCode('x) }

// this is the macro implementation
def inspectCode(x: Expr[Any])(using Quotes): Expr[Any] =
  println(x.show)
  x

