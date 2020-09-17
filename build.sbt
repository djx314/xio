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

val a05ParentDir    = backup1Dir / "a05-XIO"
val a05_xio           = project in a05ParentDir / "xio"
val a05_xio_logging   = (project in a05ParentDir / "xio-logging").dependsOn(a05_xio)
val a05_xio_async_sql = (project in a05ParentDir / "xio-async-sql").dependsOn(a05_xio_logging)
val a05_xio_codegen   = project in a05ParentDir / "xio-codegen"

val modulesDir    = baseDir / "modules"
val xio           = project in modulesDir / "xio"
val xio_logging   = (project in modulesDir / "xio-logging").dependsOn(xio)
val xio_async_sql = (project in modulesDir / "xio-async-sql").dependsOn(xio_logging)
val xio_codegen   = project in modulesDir / "xio-codegen"

addCommandAlias("codegen", "xio_codegen/runMain xio.codegen.XIOCodegen")
addCommandAlias("p", ";+xio/publishLocal;+xio_logging/publishLocal")
