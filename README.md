# Autor : Angel Santiago Hernandez 
# PRUEBA TECNICA Linktic

# Desafio

<p>
 Prueba de conocimientos en Java

## 1. Ejercicio Práctico de Programación Orientada a Objetos en Java

Se requiere un sistema para una biblioteca. Se deben modelar las clases necesarias para gestionar los diferentes tipos de recursos que tiene la biblioteca, como libros y revistas. Se debe aplicar los conceptos de programación orientada a objetos en este escenario.Define una clase Recurso que debe tener los siguientes atributos privados:

* id (int): identificador único del recurso.
* titulo (String): título del recurso.
* disponible (boolean): indica si el recurso está disponible para préstamo

La clase debe tener un constructor para inicializar estos atributos y los métodos públicos para
acceder a ellos. Define las clases Libro y Revista:

* Ambas clases deben heredar de la clase Recurso.
* La clase Libro debe tener un atributo adicional: autor (String): autor del libro.
* La clase Revista debe tener un atributo adicional: numero (int): número de la revista.
* La clase Revista debe tener un atributo adicional: tipo (tipoRevista): define el tipo derevista (mínimo 5) y deben ser definidos por un enumerado.
* Cada clase debe tener su propio constructor para inicializar sus atributos y sobrescribir el método toString() para proporcionar una representación de cadena adecuada del objeto.

Define una clase Biblioteca:
* La clase Biblioteca debe tener una lista de recursos disponibles y un método para
agregar un recurso a la biblioteca.
* Debe tener un método llamado prestarRecurso(int id) que cambie el estado de
disponibilidad del recurso con el ID proporcionado.
* Implementa un método buscarRecursoPorTitulo(String titulo) que devuelva una lista
de recursos (puede ser tanto libros como revistas) con un título específico.
*  Todos los métodos de Biblioteca son definidos por una interfaz.
Prueba del Sistema:
*    rea instancias de varios libros y revistas.
*  Agrega estos recursos a una instancia de la clase Biblioteca.
*  Realiza algunas operaciones de préstamo y búsqueda para demostrar el
funcionamiento del sistema.
Instrucciones:
*  Implementa las clases Recurso, Libro, Revista y Biblioteca según las especificaciones
dadas.
*  Utiliza los conceptos de herencia, polimorfismo, encapsulamiento y abstracción en tu
implementación.
*  Proporciona un ejemplo de uso del sistema en un método main() para demostrar el
funcionamiento de las clases.
*  Asegúrate que el código esté organizado y documentado.
*  Entrega el código fuente con el diagrama de clases (en formato de imagen) en un
archivo comprimido (.zip) titulado BibliotecaCampus.zip

## 2. Ejercicio Práctico de Patrones de Diseño en Java

Analizar el siguiente diagrama de clases:

Como se puede observar, existe un aplicativo que modela los dispositivos de manipulación de un televisor y se tienen en cuenta los métodos básicos de encender, apagar, manipular volumen y cambiar entrada. Hasta ahora los televisores solo podían controlarse con el control infrarrojo y su panel y dicho aplicativo ha funcionado bien con esta jerarquía de clases. Se añade la clase SmartPhone que por medio de conexión WiFi y un aplicativo tiene las mismas
capacidades que ControlInfrarrojo y PanelTV. Sin embargo, los mismos procesos en el SmartPhone siguen una secuencia distinta. Encender = iniciarAplicación, scanearDispositivosEnLaRed, seleccionarDispositivos, iniciarDispositivo Apagar = iniciarAplicación, scanearDispositivosEnLaRed, seleccionarDispositivos,
detenerDispositivo ManipularVolumen = iniciarAplicación, scanearDispositivosEnLaRed, seleccionarDispositivos,manipularVolumen
CambiarEntrada = iniciarAplicación, scanearDispositivosEnLaRed, seleccionarDispositivos,cambiarEntrada Los métodos que posee SmartPhone aunque tienen el mismo fin, son diferentes por lo que no puede heredar de DispositivoManipulacionTV como la x roja lo indica. Entonces, se requiere que plantees una solución a este inconveniente de la siguiente forma:

*   Identifica que patrón de diseño debe aplicarse para poder incorporar SmartPhone en el diagrama sin necesidad de alterar el resto de las clases ya creadas.
*   Aplica dicho patrón de diseño al aplicativo.
*   Proporciona un ejemplo de uso del sistema en un método main() para demostrar el funcionamiento de las clases.
*   Asegúrate que el código esté organizado y documentado.
*   Entrega el código fuente con el diagrama de clases (en formato de imagen) en un archivo comprimido (.zip) titulado PatronDisenoCampus.zip

## 3. Ejercicio práctico de Spring Boot
Configuración del Proyecto
Cree un nuevo proyecto de Spring Boot utilizando Spring Initializer (https://start.spring.io/)
con las siguientes configuraciones:
*  Grupo: com.campuslands
*   Artefacto: springboot-demo
*   Dependencias: Spring Web, Spring Data JPA, MySQL Driver
*   Packaging: JAR
Creación de una Entidad
Cree una entidad dos entidades relacionas (Tema y tipo de relación a elección), en dichas
entidades se deben contener al menos un campo por cada tipo de dato de los siguientes:
*   String
*   Double
*   Integer
*   DateTime

Repositorio y Servicio
Cree un repositorio para gestionar las entidades. Luego, cree un servicio con CRUDS
completos para el diseño creado y dos consultas hechas a través de campos diferentes al id.
Controlador
Cree un controlador con los puntos finales (endpoints) necesarios para gestionar todos los
servicios mencionados en el punto anterior.
Instrucciones:
*  Crea un proyecto de Spring Boot con las configuraciones especificadas.
* Implementa las entidades, repositorios, servicios y controladores según las
especificaciones dadas.
* Utiliza una base de datos MySQL para almacenar los datos.
* Asegúrate que el código esté organizado y documentado.
* Entrega el código fuente con el diagrama de clases (en formato de imagen), diagrama relacional de base de datos y archivos SQL necesarios, en un archivo comprimido (.zip) titulado PruebaSpringCampus.zip
Atención: adjunto a los entregables de esta prueba debe enviarse un vídeo explicando las soluciones a cada uno de los retos propuestos incluyendo los conceptos necesarios de Programación orientada a objetos, bases de datos, diagramas de clase, persistencia de datos, etc




App Planning (Architecture)
Task: Develop an architecture diagram that includes a backend service, a frontend application, and data storage, clearly depicting their interactions.

Deliverable: An architecture diagram illustrating the system's  structure.
</p>

# Diagrama

![image](https://github.com/user-attachments/assets/86de8902-7fe3-46d6-a3d7-5e040847fc1d)


# Requisitos

 - openjdk version "17.0.2" 2022-01-18
 - OpenJDK Runtime Environment (build 17.0.2+8-86)
 - OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
 - Postgress

# Instalacion
Clonar el repositorio de https://github.com/sangelAng17/pruebaTecnica.git


# DLL DATABASE

```SQL
  
  -- public.ciudad definition
  
  -- Drop table
  
  -- DROP TABLE public.ciudad;
  
  CREATE TABLE public.ciudad (
  	id_ciudad int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
  	name_ciudad varchar(255) NULL,
  	CONSTRAINT ciudad_pkey PRIMARY KEY (id_ciudad)
  );
  
  
  -- public.persona definition
  
  -- Drop table
  
  -- DROP TABLE public.persona;
  
  CREATE TABLE public.persona (
  	id_usuario int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
  	nombres varchar(255) NULL,
  	apellidos varchar(255) NULL,
  	documento varchar(255) NULL
  );
  
  
  -- public.reserva definition
  
  -- Drop table
  
  -- DROP TABLE public.reserva;
  
  CREATE TABLE public.reserva (
  	id_reserva int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
  	id_ciudad int8 NULL,
  	fecha_ingreso varchar(255) NULL,
  	fecha_salida varchar(255) NULL,
  	cant_personas varchar(255) NULL,
  	id_usuario int8 NULL,
  	id_servicio int8 NULL
  );
  
  
  -- public.servicio definition
  
  -- Drop table
  
  -- DROP TABLE public.servicio;
  
  CREATE TABLE public.servicio (
  	id_servicio int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
  	tipo_habitacion varchar(255) NULL,
  	precio varchar(255) NULL,
  	opciones varchar(255) NULL,
  	contenido varchar(255) NULL,
  	camas varchar(255) NULL,
  	checkblock bool NULL,
  	CONSTRAINT servicio_pkey PRIMARY KEY (id_servicio)
  );

INSERT INTO public.servicio
(id_servicio, tipo_habitacion, precio, opciones, contenido, camas, checkblock)
VALUES(3, 'Familiar', '300000', 'Cancelacion gratis', 'balcón, vistas al mar, vistas a la montaña , terraza y WiFi gratis', '5', false);
INSERT INTO public.servicio
(id_servicio, tipo_habitacion, precio, opciones, contenido, camas, checkblock)
VALUES(2, 'Sencilla', '50000', 'Cancelacion gratis', 'balcón, vistas al mar, vistas a la montaña , terraza y WiFi gratis', '1', false);
INSERT INTO public.servicio
(id_servicio, tipo_habitacion, precio, opciones, contenido, camas, checkblock)
VALUES(1, 'Doble', '100000', 'Cancelacion gratis', 'balcón, vistas al mar, vistas a la montaña , terraza y WiFi gratis', '2', true);

INSERT INTO public.ciudad
(id_ciudad, name_ciudad)
VALUES(9, 'Bogota');
INSERT INTO public.ciudad
(id_ciudad, name_ciudad)
VALUES(10, 'Cali');
INSERT INTO public.ciudad
(id_ciudad, name_ciudad)
VALUES(11, 'Medellin');
INSERT INTO public.ciudad
(id_ciudad, name_ciudad)
VALUES(12, 'Bucaramanga');

```
