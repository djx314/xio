CustomSettings.scalaSettings
CustomSettings.compilerSettings

val a01          = project in file(".") / "a01-XLayer"
val a02          = project in file(".") / "a02-XLayer"
val a03          = project in file(".") / "a03-XError"
val file04       = file(".") / "a04-XIO"
val a04_implicit = project in file04 / "xio-implicit"
val a04          = (project in file04 / "xio").dependsOn(a04_implicit)
val a04_codegen  = project in file04 / "xio-codegen"
val file05       = file(".") / "a05-XIO"
val a05          = project in file05 / "xio"
val a05_codegen  = project in file05 / "xio-codegen"

addCommandAlias("codegen1", "a04_codegen/runMain xio.codegen.XIOCodegen")
addCommandAlias("codegen2", "a05_codegen/runMain xio.codegen.XIOCodegen")
addCommandAlias("p", "+a05/publishLocal")