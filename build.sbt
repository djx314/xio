CustomSettings.scalaSettings
CustomSettings.compilerSettings

val baseDir    = file(".")
val backup1Dir = baseDir / "backup1"

val a01          = project in backup1Dir / "a01-XLayer"
val a02          = project in backup1Dir / "a02-XLayer"
val a03          = project in backup1Dir / "a03-XError"
val file04       = backup1Dir / "a04-XIO"
val a04_implicit = project in file04 / "xio-implicit"
val a04          = (project in file04 / "xio").dependsOn(a04_implicit)
val a04_codegen  = project in file04 / "xio-codegen"
addCommandAlias("codegen1", "a04_codegen/runMain xio.codegen.XIOCodegen")

val modulesDir    = baseDir / "modules"
val xio           = project in modulesDir / "xio"
val xio_logging   = (project in modulesDir / "xio-logging").dependsOn(xio)
val xio_async_sql = (project in modulesDir / "xio-async-sql").dependsOn(xio_logging)
val xio_codegen   = project in modulesDir / "xio-codegen"
val xio_sttp   = (project in modulesDir / "xio-sttp").dependsOn(xio_logging)

addCommandAlias("codegen", "xio_codegen/runMain xio.codegen.XIOCodegen")
addCommandAlias("p", ";+xio/publishLocal;+xio_logging/publishLocal;+xio_sttp/publishLocal")
