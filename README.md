# 🔗 ForoHub API - Challenge Alura Latam

![Java 25](https://img.shields.io/badge/Java-25.0.1-orange?style=for-the-badge&logo=openjdk)
![Spring Boot 3.5.11](https://img.shields.io/badge/Spring%20Boot-3.5.11-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![JWT](https://img.shields.io/badge/Security-JWT-black?style=for-the-badge&logo=jsonwebtokens)

**ForoHub** es una API REST diseñada para replicar el funcionamiento interno de un foro de discusión. Este proyecto permite gestionar tópicos, usuarios y autenticación, aplicando estándares modernos de desarrollo como **SOLID**, **Clean Code** y persistencia de datos relacional.

---

## 🛠️ Stack Tecnológico

| Tecnología | Propósito |
| :--- | :--- |
| **Java 25** | Lenguaje de programación (OpenJDK 25.0.1). |
| **Spring Boot 3.5.11** | Framework base para el desarrollo de la API. |
| **Spring Security** | Protección de endpoints y gestión de estados Stateless. |
| **Auth0 JWT** | Generación y validación de tokens de seguridad. |
| **Spring Data JPA** | Gestión de persistencia y consultas a la base de datos. |
| **Flyway** | Control de versiones y migraciones de esquemas SQL. |
| **SpringDoc OpenAPI** | Documentación interactiva y testeo (Swagger UI 2.7.0). |

---

## 📋 Arquitectura de la API

La aplicación sigue un modelo de capas que separa las responsabilidades de entrada, lógica de negocio y acceso a datos.



### Endpoints Principales:

* **Autenticación:** `POST /login` - Devuelve el Token JWT necesario para peticiones privadas.
* **Tópicos:**
    * `GET /topicos` - Listado con paginación de 10 elementos.
    * `POST /topicos` - Creación de nuevos temas (Requiere Token).
    * `GET /topicos/{id}` - Consulta detallada de un tópico por ID.
    * `PUT /topicos/{id}` - Edición de contenido y título.
    * `DELETE /topicos/{id}` - Eliminación física del registro.

---

## 🔐 Seguridad e Integración

Se implementó un **SecurityFilter** que intercepta cada solicitud HTTP para validar el token `Bearer`. Solo las rutas de `/login` y la documentación de Swagger están configuradas como públicas.



---

## 📖 Documentación Interactiva (Swagger)

La API cuenta con **Swagger UI**, lo que permite visualizar y probar los endpoints sin necesidad de herramientas externas como Postman.

1. Inicia la aplicación en tu entorno local.
2. Accede a: `http://localhost:8080/swagger-ui/index.html`
3. Haz clic en el botón **"Authorize"** para ingresar tu token JWT.



---

## 🛠️ Resolución de Desafíos Técnicos

Durante el desarrollo se superaron retos específicos de compatibilidad:
* **Compatibilidad Java 25:** Ajuste de dependencias de `SpringDoc` para evitar errores de reflexión en versiones de Java no LTS.
* **Error 500 en Swagger:** Configuración de excepciones en el filtro de seguridad para permitir que el motor de OpenAPI genere el JSON de documentación (`/v3/api-docs`) de forma pública.

---

## ⚙️ Instalación y Configuración

1. **Clonar repositorio:**
   ```bash
   git clone [https://github.com/tu-usuario/forohub.git](https://github.com/tu-usuario/forohub.git)
