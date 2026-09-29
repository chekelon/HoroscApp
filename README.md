
# 🔮 HoroscApp
 
Aplicación Android de horóscopos desarrollada en **Kotlin**. Permite consultar la predicción diaria de cada signo zodiacal, obtener una predicción de la suerte y explorar una sección de quiromancia con la cámara del dispositivo.
 
> Proyecto de aprendizaje enfocado en escribir código de calidad y aplicar las mejores prácticas de la industria en desarrollo Android.
 
---
 
## 📱 ¿De qué trata la app?
 
HoroscApp se organiza en tres secciones principales, accesibles desde una barra de navegación inferior:
 
| Sección | Descripción |
|---|---|
| ♈ **Horóscopo** | Lista de los 12 signos zodiacales. Al seleccionar uno se abre una pantalla de detalle con la predicción del día, consumida desde una API REST. |
| 🍀 **Suerte** | Muestra una predicción aleatoria con animaciones y la posibilidad de compartirla mediante *Intents*. |
| ✋ **Quiromancia** | Usa la cámara del dispositivo (CameraX) para "leer la mano" y mostrar una interpretación. |
 
---
 
## 🏗️ Arquitectura
 
El proyecto sigue una **arquitectura MVVM** combinada con principios de **Clean Architecture**, separando responsabilidades en capas:
 
 
### Capas
 
- **UI (presentación):** Activities y Fragments que se encargan únicamente de pintar el estado. Cada pantalla tiene su `ViewModel`, que expone el estado mediante `StateFlow` y ejecuta la lógica con corrutinas.
- **Domain:** contiene los casos de uso (por ejemplo, obtener la predicción de un signo) y las interfaces de repositorio. No depende de Android ni de librerías externas.
- **Data:** implementa los repositorios, hace las llamadas de red con Retrofit y convierte las respuestas de la API en modelos de dominio mediante *mappers*.
### Flujo de datos
 
1. El usuario interactúa con un `Fragment`.
2. El `Fragment` notifica al `ViewModel`.
3. El `ViewModel` lanza una corrutina que ejecuta un **caso de uso**.
4. El caso de uso pide los datos al **repositorio**.
5. El repositorio consulta la API con **Retrofit** y mapea la respuesta.
6. El resultado regresa al `ViewModel`, que actualiza su `StateFlow`.
7. El `Fragment` observa el estado y actualiza la interfaz.
---
 
## 🧰 Tecnologías y conceptos
 
- **Lenguaje:** Kotlin
- **Arquitectura:** MVVM + Clean Architecture
- **Build:** Gradle con Kotlin DSL (KTS)
- **Navegación:** Navigation Component + Fragments
- **Inyección de dependencias:** Dagger Hilt
- **Asincronía y estado:** Corrutinas y `StateFlow`
- **Listas:** RecyclerView
- **Red:** Retrofit, Interceptors y Mappers
- **Cámara:** CameraX
- **Intents:** para compartir contenido
- **Animaciones:** transiciones y efectos visuales
- **Testing:** pruebas unitarias (UnitTest) y de interfaz (UITest)
---
 
## 📂 Estructura del proyecto
 
```
HoroscApp/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/.../horoscapp/
│       │   │   ├── data/        # Repositorios, red (Retrofit), respuestas, mappers
│       │   │   ├── domain/      # Casos de uso, modelos e interfaces
│       │   │   ├── di/          # Módulos de inyección de dependencias
│       │   │   └── ui/          # Horóscopo, suerte, quiromancia, detalle
│       │   └── res/             # Layouts, drawables, strings, navegación
│       ├── test/                # Pruebas unitarias
│       └── androidTest/         # Pruebas de interfaz
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```
 

 
---
 
## 🚀 Cómo ejecutar el proyecto
 
### Requisitos
 
- Android Studio (versión reciente)
- JDK 17 o superior
- Un emulador o dispositivo físico con Android 7.0+ (ajusta según tu `minSdk`)
### Pasos
 
```bash
# 1. Clonar el repositorio
git clone https://github.com/chekelon/HoroscApp.git
 
# 2. Abrir la carpeta en Android Studio
 
# 3. Sincronizar Gradle y ejecutar la app (▶️ Run)
```
 
También puedes compilar desde la terminal:
 
```bash
./gradlew assembleDebug
```
 
Para correr las pruebas:
 
```bash
./gradlew test               # Pruebas unitarias
./gradlew connectedAndroidTest  # Pruebas de UI (requiere dispositivo/emulador)
```
 
---
 
## 🎓 Contenido del curso cubierto
 
Este repositorio acompaña el curso *Android Master Intermedio*, cuyo temario incluye:
 
- Arquitectura MVVM y clean code
- Fragments
- Navigation Component
- Gradle KTS
- Inyección de dependencias
- StateFlow y corrutinas
- RecyclerView
- Retrofit, interceptors y mappers
- Intents
- CameraX
- Animaciones
- UnitTest y UITest
---
 
## 👤 Autor

Es parte del curso de @AristiDev.
 
**chekelon** — [github.com/chekelon](https://github.com/chekelon)
 

