# MavenWSGasto

> mvn archetype:generate

luego ingresar: 

>cxf-jaxws

>2 #org.apache.cxf.archetype:cxf-jaxws-javafirst

> 136 (3.2.5)

> groupid: se puede manejar como el empaquetado que va a tener nuestro proyecto, ejemplo com.test.gastos

> artifactid: se considera como el nombre del proyecto
gastos

> package: dar enter

> luego enter en la confirmacion

> cd Gastos

> mvn install

Importar proyecto en Spring tool suite

adicionar heroku
> heroku plugins:install heroku-cli-deploy
> heroku create
> mvn clean
> mvn clean install package
> heroku war:deploy target/Gastos-1.0-SNAPSHOT.war --app limitless-shore-90948

