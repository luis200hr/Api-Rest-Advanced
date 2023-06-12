# Api-Rest-Advanced
Voll.med es una clínica médica ficticia que necesita una aplicación para gestionar las citas. La app debe tener funcionalidades que permitan el registro de médicos y pacientes


<h2>🔐 Autenticación y autorización</h2>


Se implemento con el uso de [Spring Security](https://docs.spring.io/spring-security/reference/index.html)  y [Json web Token](https://jwt.io/introduction) . Lo que hace es que teniendo en nuestra base de datos de usuarios registrados
al momento de iniciar sesion si los datos de usuario y clave son lo que tenemos en nuestra base con la encyrtacion Bcrypt se le va a otorgar
un token a nuestro usuario, el usuario con ese token podrá tener acceso a los endpoint para crear, agregar, eliminar, etc.
Sí la clave o usuario son incorrectas el usuario no podra se autenticado y tampoco tendra autorización para acceder los endpoints.
<h2>🕹️ Endpoints</h2>

- 📓 __Inicio de sesion__
  - login
- 👨‍🔬 __Medico__
  - Registrar nuevo medico
  - Obtener todos los medicos
  - Actualizar medico por id
  - Eliminar medico 
  - Obtener un medico
- 🧍‍♂️ __Paciente__
  - Registrar nuevo paciente
  - Obtener todos los paciente
  - Actualizar paciente por id
  - Eliminar paciente 
  - Obtener un paciente

<h2>🛠️Tecnologias Usadas</h2>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/springboot-v3.1.0-6DB33F?style=for-the-badge&logo=Springboot)
![Flyway](https://img.shields.io/badge/flyway--CC0200?style=for-the-badge&logo=flyway)

<h2>🗄️Servidor</h2>
Se utilizo a Apache Tomcat para el servidor en local
<h2>✅Validaciones</h2>
Las validaciones se implementaron a nivel de la api para que no llegen vacios o no se repitan los campos.

Campo | Validacion
------------ | ------------
Nombre | Solo letras - No puede llegar vacio
Especialidad | Ortopedia, Ginecologia, Cardiologia, Pediatria - No puede llegar vacio
Email | Formato email - No puede llegar vacio - Unico
DocumendoID | Solo números - No puede llegar vacio -Unico
Telefono | Solo números - No puede llegar vacio
Calle | Letras y números - No puede llegar vacio
Numero | Solo números - No puede llegar vacio
Complemento | Letras y números
Ciudad | Letras y números - No puede llegar vacio

<h2>🔰Buenas Practicas</h2>

- Estandarizando retornos de API
  - Con ResponseEntity se estandarizo las respuestas de nuestras llamadas HTTP
- Tratamiento de errores
- Proteccion de claves en codigo
  - Con el uso de variables de entorno se realizo la proteccion de las contraseña que usamos para nuestra base de datos, claves


![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/48cdf28e-e745-43ac-bedd-aebf0e34efe2)
![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/d9251875-213e-4f5f-836d-f66f4f3896d0)

<h2>📄Documentación </h2>

<h3>Login</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/80610b10-14a9-4518-b4d7-9a8f35457600)
<h3>Registrar nuevo Medico</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/b2c8b264-a770-490b-9df1-0eededb59abc)
<h3>Obtener lista de todos los medicos</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/a4d8bb8f-0cd2-4e40-b4c1-287cdf8fb5b2)
<h3>Actualizar medicos</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/0213abd8-a1ce-40d3-b46e-55bb9c359c65)
<h3>Eliminar Medico</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/959d7f5e-4b71-40f1-baf1-f4123d23abc5)
<h3>Obtener 1 Medico</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/cc0ade3c-27ce-4c4a-8101-01864ea1bf71)


<h2> Pacientes </h2>
Para los Pacientes es lo mismo solo cambia al registrar un nuevo paciente porque no tiene especialidad
<h3>Registrar Medico</h3>

![image](https://github.com/luis200hr/Api-Rest-Advanced/assets/120597722/a8cfb30a-020f-4e5b-9c8a-b23fe74047f3)
