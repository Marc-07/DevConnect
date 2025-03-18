# 📌 Proyecto CRUD de Usuarios en Java

## 📌 Descripción
Este proyecto es un CRUD (Create, Read, Update, Delete) de usuarios en **Java** utilizando **JDBC** para la conexión con una base de datos **MySQL**. Implementa las operaciones básicas de gestión de usuarios en una aplicación.

## ⚙️ Características
- 📥 **Inserción** de usuarios.
- 📂 **Consulta** de usuarios.
- ✏️ **Actualización** de usuarios.
- ❌ **Eliminación** de usuarios.
- 🔗 **Conexión con MySQL mediante JDBC**.
- 🏷 **Código estructurado con estándares de codificación**.

---

## 🛠️ Tecnologías Utilizadas
- **Java** (JDK 8 o superior)
- **MySQL**
- **JDBC (Java Database Connectivity)**
- **Maven** (Opcional)
- **Git** y **GitHub** para control de versiones

---

## 📂 Estructura del Proyecto
```
📦 src/main/java/com/devconnect
 ┣ 📂 dao          # Clases de acceso a la base de datos (UsuarioDAO.java)
 ┣ 📂 model        # Clases del modelo de datos (Usuario.java)
 ┣ 📂 util         # Clase para conexión a la BD (ConexionBD.java)
 ┣ 📜 Main.java    # Clase principal para ejecutar la aplicación
```

---

## 🏗️ Instalación y Configuración
### 🔹 Requisitos previos
Antes de ejecutar el proyecto, asegúrate de tener instalado:
- **Java JDK 8 o superior**
- **MySQL** con una base de datos configurada
- **Un IDE como IntelliJ IDEA, Eclipse o NetBeans**

### 🔹 Configuración de la Base de Datos
Ejecuta el siguiente script en MySQL para crear la base de datos y la tabla de usuarios:
```sql
CREATE DATABASE devconnect;
USE devconnect;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    contrasena VARCHAR(255)
);
```

### 🔹 Configuración de la conexión a la BD
Edita la clase **ConexionBD.java** y actualiza las credenciales de la base de datos:
```java
private static final String URL = "jdbc:mysql://localhost:3306/devconnect";
private static final String USUARIO = "tu_usuario";
private static final String PASSWORD = "tu_contraseña";


## 🚀 Mejoras Futuras
- Implementación de una interfaz gráfica (GUI) con JavaFX o Swing.
- Manejo de contraseñas seguras con hashing (BCrypt).
- Pruebas unitarias con JUnit.

---

## 📌 Autor
**María Ramos**

