# 📱 DOCUMENTACIÓN COMPLETA - APP GUÍA FII UG
####Universidad de Guayaquil - Facultad de Ingeniería Industrial
#### Aplicación Android para Navegación del Campus Mapasingue
## 📑 TABLA DE CONTENIDOS
1.	Estructura General del Proyecto
2.	Lenguajes de Programación Utilizados
3.	Librerías y Dependencias
4.	Estructura de Carpetas
5.	Archivos de Configuración
6.	Actividades (Pantallas)
7.	Layouts XML
8.	Recursos Drawable
9.	Métodos Principales
10.	Flujo de Navegación

## 1. ESTRUCTURA GENERAL DEL PROYECTO {#estructura-general}
El proyecto está organizado siguiendo la arquitectura estándar de Android:
```
GUIAFIIUG/
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   ├── java/com.vargas.guiafiiug/
│   │   ├── MainActivity.kt
│   │   ├── AulasActivity.java
│   │   ├── BloquesActivity.java
│   │   ├── DepartamentosActivity.java
│   │   ├── DetalleActivity.java
│   │   ├── LocationData.java
│   │   ├── MapaActivity.java
│   │   └── ResultadoActivity.java
│   ├── res/
│   │   ├── drawable/
│   │   ├── layout/
│   │   ├── values/
│   │   └── mipmap/
│   └── build.gradle.kts
├── gradle/
└── settings.gradle.kts
```

## 2. LENGUAJES DE PROGRAMACIÓN UTILIZADOS {#lenguajes}
### 2.1 KOTLIN
**Archivo:** MainActivity.kt
**¿Por qué Kotlin?**
- Lenguaje moderno oficial de Android (desde 2017)
- Código más conciso que Java (menos líneas)
- Null safety (previene errores de null)
- Sintaxis más limpia y expresiva

**¿Dónde se usa en este proyecto?**
- MainActivity.kt: Pantalla principal de la aplicación
- Gestión de eventos de búsqueda
- Navegación entre secciones

**Características utilizadas:**
```
// Lambda expressions (funciones cortas)
searchButton.setOnClickListener { realizarBusqueda() }

// Null safety
val busqueda = searchEditText.text.toString().trim()

// Smart casts
if (busqueda.isEmpty()) { ... }
```
### 2.2 JAVA
**Archivos:** Todas las demás Activities y LocationData

**¿Por qué Java?**
- Lenguaje tradicional de Android
- Mayor compatibilidad con librerías antiguas
- Más documentación disponible
- Fácil de entender para principiantes

**¿Dónde se usa en este proyecto?**
- **LocationData.java**: Base de datos en memoria
- **AulasActivity.java**: Listado de aulas
- **BloquesActivity.java**: Listado de bloques
- **DepartamentosActivity.java**: Departamentos y servicios
- **DetalleActivity.java**: Detalles de ubicaciones
- **MapaActivity.java**: Visualización del mapa
- **ResultadoActivity.java**: Resultados de búsqueda

### 2.3 XML (eXtensible Markup Language)
Carpeta: `res/layout/ y res/drawable/`

**¿Por qué XML?**
- Lenguaje de marcado para definir interfaces
- Separa la lógica (Java/Kotlin) de la vista (XML)
- Fácil de leer y modificar
- Permite previsualización en Android Studio

**¿Dónde se usa?**
- **Layouts:** Diseño de pantallas
- **Drawables:** Formas, gradientes, fondos
- **Strings:** Textos de la aplicación
- **Manifest:** Configuración de la app

## 3. LIBRERÍAS Y DEPENDENCIAS {#librerias}

### 3.1 AndroidX Core KTX
`implementation(libs.androidx.core.ktx)`

**Propósito:**
- Extensiones de Kotlin para Android
- Simplifica operaciones comunes
- Mejora la legibilidad del código

**Ejemplo de uso:**
```
// Sin KTX
view.setOnClickListener(new View.OnClickListener() { ... })
// Con KTX
view.setOnClickListener { ... }
```
### 3.2 AppCompat
`implementation(libs.androidx.appcompat)`

**Propósito:**
- Compatibilidad con versiones antiguas de Android
- Permite usar características modernas en dispositivos viejos
- Componentes de UI consistentes

**¿Dónde se usa?**
- **AppCompatActivity:** Clase base de todas nuestras Activities
- Temas y estilos modernos

### 3.3 Material Design
`implementation(libs.material)`

**Propósito:**
- Componentes de Google Material Design
- CardView, Buttons, TextFields mejorados
- Animaciones y transiciones suaves

**Componentes usados en el proyecto:**
- **CardView:** Tarjetas con sombras y bordes redondeados
- **MaterialButton:** Botones con estilo moderno
- **Elevation:** Sombras y profundidad

### 3.4 ConstraintLayout
`implementation(libs.androidx.constraintlayout)`

**Propósito:**
- Layout flexible y poderoso
- Permite crear interfaces complejas sin layouts anidados
- Mejor rendimiento que LinearLayout/RelativeLayout

**¿Dónde se usa?**
- Todas las pantallas usan ConstraintLayout como raíz
- Posicionamiento relativo de elementos

### 3.5 CardView
`implementation("androidx.cardview:cardview:1.0.0")`

**Propósito:**
- Tarjetas con elevación y bordes redondeados
- Contenedor visual para agrupar información

**¿Dónde se usa?**
- Cards de accesos rápidos (Aulas, Departamentos, Bloques, Mapa)
- Items de listado de ubicaciones
- Cards informativas

### 3.6 PhotoView
`implementation("com.github.chrisbanes:PhotoView:2.3.0")`

**Propósito:**
- Visualización de imágenes con zoom
- Pinch to zoom (pellizcar para acercar)
- Pan (arrastre) de la imagen

**¿Dónde se usa?**
- **MapaActivity:** Para ver el mapa satelital con zoom interactivo

Características:
- ✅ Zoom con pellizco
- ✅ Doble tap para zoom rápido
- ✅ Arrastre suave
- ✅ Límites de zoom configurables

## 4. ESTRUCTURA DE CARPETAS {#carpetas}
### 4.1 📁 MANIFESTS

**Ubicación:** `app/manifests/AndroidManifest.xml`

¿Para qué sirve?
- Archivo de configuración principal de la app
- Declara todas las Activities (pantallas)
- Define permisos necesarios
- Configura el ícono y nombre de la app
- Establece la Activity de inicio (LAUNCHER)

**Contenido clave:**
```
<application
  android:icon="@mipmap/ic_launcher"
  android:label="@string/app_name"
  android:theme="@style/Theme.GUIAFIIUG">
  
  <!-- Activity principal (pantalla de inicio) -->
  <activity android:name=".MainActivity" android:exported="true">
    <intent-filter>
      <action android:name="android.intent.action.MAIN" />
      <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
  </activity>
  
  <!-- Otras activities -->
  <activity android:name=".ResultadoActivity" />
  <activity android:name=".AulasActivity" />
  ...
</application>
```
**Elementos importantes:**

- `android:exported="true":` Permite abrir la app desde el launcher
- `android:parentActivityName:` Define navegación hacia atrás
- `intent-filter:` Define cómo se puede abrir la Activity

### 4.2 📁 JAVA/KOTLIN (com.vargas.guiafiiug)
**Ubicación:** `app/java/com.vargas.guiafiiug/`

**¿Para qué sirve?**
- Contiene todo el código ejecutable de la app
- Lógica de negocio
- Gestión de eventos
- Navegación entre pantallas
- Procesamiento de datos

**Archivos:**
- `MainActivity.kt` - Pantalla principal
- `AulasActivity.java` - Lista de aulas
- `BloquesActivity.java` - Lista de bloques
- `DepartamentosActivity.java` - Departamentos
- `DetalleActivity.java` - Detalles de ubicación
- `LocationData.java` - Base de datos
- `MapaActivity.java` - Mapa del campus
- `ResultadoActivity.java` - Resultados de búsqueda

### 4.3 📁 RES (Resources - Recursos)
#### 4.3.1 🎨 DRAWABLE

**Ubicación:** `app/res/drawable/`

**¿Para qué sirve?**
- Almacena recursos gráficos
- Formas (shapes)
- Gradientes
- Bordes
- Fondos personalizados

**Archivos del proyecto:**
1. button_background.xml
```
<!-- Fondo azul con bordes redondeados para botones -->
<shape>
  <solid android:color="#1976D2"/>
  <corners android:radius="8dp"/>
</shape>
```
**Uso:** Botón de búsqueda

2. card_background_1.xml (hasta card_background_4.xml)
```
<!-- Gradiente azul claro para las cards -->
<shape>
  <gradient
    android:startColor="#E3F2FD"
    android:endColor="#BBDEFB"
    android:angle="135"/>
  <corners android:radius="12dp"/>
</shape>
```
**Uso:** Fondos de las cards de accesos rápidos

3. header_gradient.xml
```
<!-- Gradiente azul para el header -->
<shape>
  <gradient
    android:startColor="#1976D2"
    android:endColor="#1565C0"
    android:angle="135"/>
</shape>
```
**Uso:** Encabezado de todas las pantallas

4. item_background.xml
```
<!-- Fondo blanco con borde gris para items -->
<shape>
  <solid android:color="#FFFFFF"/>
  <corners android:radius="8dp"/>
  <stroke android:color="#E0E0E0" android:width="1dp"/>
</shape>
```
**Uso:** Items de lista de ubicaciones

5. search_background.xml
```
<!-- Fondo gris claro para el campo de búsqueda -->
<shape>
  <solid android:color="#F5F5F5"/>
  <corners android:radius="8dp"/>
  <stroke android:color="#E0E0E0" android:width="1dp"/>
</shape>
```
**Uso:** Campo de texto de búsqueda

#### 4.3.2 📐 LAYOUT
**Ubicación:** `app/res/layout/`

**¿Para qué sirve?**
- Define la estructura visual de cada pantalla
- Posición de elementos (botones, textos, imágenes)
- Tamaños y márgenes
- Jerarquía de vistas

**Archivos del proyecto:**
1. activity_main.xmlPantalla principal
    - Campo de búsqueda
    - 4 cards de accesos rápidos
    - Header con título de la facultad
2. activity_lista.xml
    - Layout genérico para listas
    - Header con botón de volver
    - ScrollView para contenido desplazable
    - Container para items dinámicos
3. activity_resultado.xml
    - Pantalla de resultados de búsqueda
    - Lista de ubicaciones encontradas
    - Mensaje de "sin resultados"
4. activity_detalle.xml
    - Pantalla de detalles de ubicación
    - Card con información básica
    - Card con instrucciones de cómo llegar
    - Card con información útil
5. activity_mapa.xml
    - Pantalla del mapa
    - PhotoView para imagen con zoom
    - Card con instrucciones de uso
6. item_ubicacion.xml
    - Layout reutilizable para cada ubicación
    - Ícono según tipo
    - Nombre, bloque, piso
    - Descripción

#### 4.3.3 📝 VALUES
**Ubicación:** `app/res/values/`

**¿Para qué sirve?**
- Almacena valores constantes
- Textos (strings)
- Colores
- Dimensiones
- Estilos

**Archivo: strings.xml**
```
<resources>
  <string name="app_name">Guía FII UG</string>
  <string name="buscar">Buscar</string>
  <string name="aulas">Aulas</string>
  <string name="universidad">Universidad de Guayaquil</string>
...
</resources>
```
**Ventajas:**
- ✅ Facilita traducción a otros idiomas
- ✅ Cambios centralizados
- ✅ Evita textos hardcodeados
- ✅ Mejores prácticas de Android

# 4.3.4 🎭 MIPMAP
**Ubicación:** `app/res/mipmap/`

**¿Para qué sirve?**
- Almacena íconos de la aplicación
- Diferentes tamaños para diferentes densidades de pantalla

**Archivos:**
- `ic_launcher.png` - Ícono cuadrado
- `ic_launcher_round.png` - Ícono redondo
- Versiones: mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi

## 5. ARCHIVOS DE CONFIGURACIÓN {#configuracion}
### 5.1 build.gradle.kts (Module: app)
**Ubicación:** `app/build.gradle.kts`

**¿Para qué sirve?**
- Configuración de compilación del módulo
- Versiones de SDK
- Dependencias (librerías)
- Configuración de firma

**Secciones clave:**
```
android {
  namespace = "com.vargas.guiafiiug"
  compileSdk = 36      // Versión de SDK para compilar
  
  defaultConfig {
    applicationId = "com.vargas.guiafiiug"  // ID único de la app
    minSdk = 24      // Android 7.0 mínimo
    targetSdk = 36   // Última versión objetivo
    versionCode = 1  // Versión interna (número)
    versionName = "1.0"  // Versión visible para usuarios
  }
  
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}

dependencies {
  // Aquí van todas las librerías
}
```

### 5.2 settings.gradle.kts
**Ubicación:** Raíz del proyecto

**¿Para qué sirve?**
- Configuración global del proyecto
- Repositorios de dependencias
- Módulos incluidos

```
dependencyResolutionManagement {
  repositories {
    google()           // Repositorio de Google
    mavenCentral()     // Repositorio Maven
    maven { url = uri("https://jitpack.io") }  // JitPack (PhotoView)
  }
}
```
### 5.3 libs.versions.toml
**Ubicación:** gradle/libs.versions.toml

**¿Para qué sirve?**
- Centraliza versiones de dependencias
- Evita conflictos de versiones
- Facilita actualizaciones

```
[versions]
agp = "9.0.0"
kotlin = "1.9.22"
coreKtx = "1.10.1"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
```

## 6. ACTIVIDADES (PANTALLAS) {#actividades}
### 6.1 🏠 MainActivity.kt

**Tipo:** Kotlin

**Layout:** activity_main.xml

**Propósito:**
- Pantalla de inicio de la aplicación
- Búsqueda de ubicaciones
- Navegación a otras secciones

**Componentes visuales:**
- Campo de búsqueda (EditText)
- Botón de búsqueda (Button)
- 4 Cards de accesos rápidos (CardView)
    - Aulas
    - Departamentos
    - Bloques
    - Mapa Campus

**Variables principales:**
```
private lateinit var searchEditText: EditText
private lateinit var searchButton: Button
private lateinit var aulasCard: CardView
private lateinit var departamentosCard: CardView
private lateinit var bloquesCard: CardView
private lateinit var mapaCard: CardView
```
**Métodos:**
1. onCreate(savedInstanceState: Bundle?)
```
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  // Inicializar vistas
  // Configurar listeners
}
```
**¿Qué hace?**
- Se ejecuta al crear la Activity
- Infla el layout XML
- Inicializa las vistas
- Configura los eventos de clic

2. realizarBusqueda()
```
private fun realizarBusqueda() {
  val busqueda = searchEditText.text.toString().trim()
  if (busqueda.isEmpty()) {
    Toast.makeText(this, "Por favor ingresa algo para buscar", Toast.LENGTH_SHORT).show()
    return
  }
  val intent = Intent(this, ResultadoActivity::class.java)
  intent.putExtra("busqueda", busqueda)
  startActivity(intent)
}
```
**¿Qué hace?**
- Obtiene el texto del campo de búsqueda
- Valida que no esté vacío
- Crea un Intent para ResultadoActivity
- Pasa el término de búsqueda
- Inicia la nueva Activity

**Navegación:**
```
aulasCard.setOnClickListener {
  startActivity(Intent(this, AulasActivity::class.java))
}
```

### 6.2 📚 AulasActivity.java
**Tipo:** Java

**Layout:** activity_lista.xml

**Propósito:**
- Mostrar lista de todas las aulas
- Permitir seleccionar un aula para ver detalles

**Variables principales:**
`private LinearLayout aulasContainer;`
`private ImageButton btnVolver;`

**Métodos:**

1. onCreate(Bundle savedInstanceState)
```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_lista);
  
  TextView titulo = findViewById(R.id.tituloLista);
  titulo.setText("Aulas");
    
  aulasContainer = findViewById(R.id.listaContainer);
  btnVolver = findViewById(R.id.btnVolverLista);
    
  btnVolver.setOnClickListener(v -> finish());
  cargarAulas();
}
```
**¿Qué hace?**
- Establece el layout
- Cambia el título a "Aulas"
- Inicializa las vistas
- Configura botón de volver
- Llama a cargarAulas()

**cargarAulas()**
```
private void cargarAulas() {
  List<LocationData.Ubicacion> aulas = LocationData.obtenerPorTipo("aula");
  
  for (final LocationData.Ubicacion aula : aulas) {
      View itemView = getLayoutInflater().inflate(
        R.layout.item_ubicacion,
        aulasContainer,
        false
    );
    
    // Configurar textos
    TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
    nombreText.setText(aula.nombre);
    
    // Click listener para ver detalles
    itemView.setOnClickListener(v -> {
      Intent intent = new Intent(AulasActivity.this, DetalleActivity.class);
      intent.putExtra("nombre", aula.nombre);
      intent.putExtra("bloque", aula.bloque);
      // ... más datos
      startActivity(intent);
    });
    
    aulasContainer.addView(itemView);
  }
}
```
**¿Qué hace?**
- Obtiene todas las ubicaciones tipo "aula"
- Por cada aula:
    - Infla el layout item_ubicacion.xml
    - Configura los textos (nombre, bloque, piso)
    - Configura el ícono según tipo
    - Agrega listener para ver detalles
    - Añade el item al contenedor

### 6.3 🏛️ BloquesActivity.java

**Tipo:** Java

**Layout:** activity_lista.xml

**Propósito:**
- Mostrar bloques del campus agrupados
- Mostrar cantidad de ubicaciones por bloque
- Listar primeras 3 ubicaciones de cada bloque

Variables principales:
`private LinearLayout bloquesContainer;`
`private ImageButton btnVolver;`

**Métodos:**
1. onCreate(Bundle savedInstanceState)
- Similar a AulasActivity
- Cambia título a "Bloques del Campus"

2. cargarBloques()
```
private void cargarBloques() {
  Map<String, List<LocationData.Ubicacion>> bloqueMap = LocationData.obtenerPorBloque();
  
  for (Map.Entry<String, List<LocationData.Ubicacion>> entry : bloqueMap.entrySet()) {
    String nombreBloque = entry.getKey();
    List<LocationData.Ubicacion> ubicaciones = entry.getValue();
    
    // Crear CardView programáticamente
    CardView cardView = new CardView(this);
    // Configurar parámetros...
    
    // Crear LinearLayout para contenido
    LinearLayout contentLayout = new LinearLayout(this);
    
    // Título del bloque
    TextView tituloBloque = new TextView(this);
    tituloBloque.setText("🏛️ " + nombreBloque);
    
    // Cantidad de ubicaciones
    TextView cantidadText = new TextView(this);
    cantidadText.setText(ubicaciones.size() + " ubicaciones");
    
    // Mostrar primeras 3 ubicaciones
    int count = 0;
    for (LocationData.Ubicacion ubicacion : ubicaciones) {
      if (count >= 3) break;
      TextView itemText = new TextView(this);
      itemText.setText("• " + ubicacion.nombre + " - " + ubicacion.piso);
      contentLayout.addView(itemText);
      count++;
    }
    
    // Si hay más de 3, mostrar "... y X más"
    if (ubicaciones.size() > 3) {
      TextView masText = new TextView(this);
      masText.setText("... y " + (ubicaciones.size() - 3) + " más");
      contentLayout.addView(masText);
    }
    
    cardView.addView(contentLayout);
    bloquesContainer.addView(cardView);
  }
}
```
**¿Qué hace?**
- Obtiene mapa de bloques con sus ubicaciones
- Por cada bloque:
    - Crea una CardView programáticamente
    - Agrega título del bloque
    - Muestra cantidad total de ubicaciones
    - Lista las primeras 3 ubicaciones
    - Si hay más, indica cuántas más hay

### 6.4 🏢 DepartamentosActivity.java
**Tipo:** Java

**Layout:** activity_lista.xml

**Propósito:**
- Listar departamentos administrativos
- Listar servicios (biblioteca, cafetería, etc.)

Variables principales:
`private LinearLayout departamentosContainer;`
`private ImageButton btnVolver;`

**Métodos:**
1. onCreate(Bundle savedInstanceState)
- Establece título "Departamentos y Servicios"
- Llama a cargarDepartamentos()

2. cargarDepartamentos()
```
private void cargarDepartamentos() {
  List<LocationData.Ubicacion> departamentos =
  LocationData.obtenerPorTipo("departamento");
  List<LocationData.Ubicacion> servicios =
  LocationData.obtenerPorTipo("servicio");
  
  // Agregar departamentos
  for (LocationData.Ubicacion depto : departamentos) {
    agregarItem(depto, "🏢");
  }
  
  // Agregar servicios
  for (LocationData.Ubicacion servicio : servicios) {
    agregarItem(servicio, "🔧");
  }
}
```
3. agregarItem(Ubicacion ubicacion, String icono)
```
private void agregarItem(final LocationData.Ubicacion ubicacion, String icono) {
  View itemView = getLayoutInflater().inflate(
    R.layout.item_ubicacion,
    departamentosContainer,
    false
  );
  // Configurar textos
  TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
  TextView tipoIcon = itemView.findViewById(R.id.tipoIcon);
  nombreText.setText(ubicacion.nombre);
  tipoIcon.setText(icono);
  
  // Click para ver detalles
  itemView.setOnClickListener(v -> {
    Intent intent = new Intent(DepartamentosActivity.this, DetalleActivity.class);
    // Pasar datos...
    startActivity(intent);
  });
  
  departamentosContainer.addView(itemView);
}
```
**¿Qué hace? **
- Método reutilizable para agregar items
- Infla el layout
- Configura textos e ícono
- Agrega listener
- Añade al contenedor



### 6.5 📄 DetalleActivity.java
Tipo: Java
Layout: activity_detalle.xml

Propósito:
- Mostrar información completa de una ubicación
- Mostrar instrucciones de cómo llegar
- Información útil adicional

Variables principales:
`private ImageButton btnVolver;`
`private TextView nombreText, bloqueText, pisoText;`
`private TextView descripcionText, instruccionesText, tipoIcon;`

Métodos:
1. onCreate(Bundle savedInstanceState)
```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_detalle);
  
  // Inicializar vistas
  btnVolver = findViewById(R.id.btnVolverDetalle);
  nombreText = findViewById(R.id.nombreDetalle);
  // ... más vistas
  
  btnVolver.setOnClickListener(v -> finish());
  
  // Obtener datos del Intent
  String nombre = getIntent().getStringExtra("nombre");
  String bloque = getIntent().getStringExtra("bloque");
  String piso = getIntent().getStringExtra("piso");
  String descripcion = getIntent().getStringExtra("descripcion");
  String instrucciones = getIntent().getStringExtra("instrucciones");
  String tipo = getIntent().getStringExtra("tipo");
  
  // Validación null safety
  if (nombre == null) nombre = "";
  if (bloque == null) bloque = "";
  // ... más validaciones
  
  // Mostrar datos
  nombreText.setText(nombre);
  bloqueText.setText("📍 " + bloque);
  pisoText.setText("🏢 " + piso);
  descripcionText.setText(descripcion);
  instruccionesText.setText(instrucciones);
  
  // Ícono según tipo
  switch (tipo) {
    case "aula": tipoIcon.setText("📚"); break;
    case "departamento": tipoIcon.setText("🏢"); break;
    case "servicio": tipoIcon.setText("🔧"); break;
    default: tipoIcon.setText("📍"); break;
  }
}
```
**¿Qué hace?**
- Recibe datos de la Activity anterior vía Intent
- Valida que los datos no sean null
- Muestra toda la información en los TextViews
- Asigna ícono según el tipo de ubicación

### 6.6 🗺️ MapaActivity.java

Tipo: Java

Layout: activity_mapa.xml

Propósito:

- Mostrar mapa satelital del campus
- Permitir zoom interactivo
- Permitir navegación por la imagen

Variables principales:
`private ImageButton btnVolver;`
`private PhotoView photoView;`

Métodos:
1. onCreate(Bundle savedInstanceState)
```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_mapa);
  
  TextView titulo = findViewById(R.id.tituloMapa);
  titulo.setText("Mapa del Campus Mapasingue");
  
  btnVolver = findViewById(R.id.btnVolverMapa);
  btnVolver.setOnClickListener(v -> finish());
  
  // Configurar PhotoView para zoom
  photoView = findViewById(R.id.mapaPhotoView);
  photoView.setImageResource(R.drawable.mapa_satelital);
}
```
¿Qué hace?
- Establece el layout
- Inicializa PhotoView
- Carga la imagen satelital

PhotoView automáticamente permite:
- ✅ Pinch to zoom
- ✅ Double tap to zoom
- ✅ Pan (arrastre)

### 6.7 🔍 ResultadoActivity.java

Tipo: Java

Layout: activity_resultado.xml

Propósito:
- Mostrar resultados de búsqueda
- Listar ubicaciones que coinciden
- Mostrar mensaje si no hay resultados

Variables principales:

java
```
private TextView tituloResultado, noResultadosText;
private LinearLayout resultadosContainer;
private ImageButton btnVolver;
```
Métodos:
1. onCreate(Bundle savedInstanceState)

java

```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_resultado);
  
  tituloResultado = findViewById(R.id.tituloResultado);
  resultadosContainer = findViewById(R.id.resultadosContainer);
  noResultadosText = findViewById(R.id.noResultadosText);
  btnVolver = findViewById(R.id.btnVolver);
  
  btnVolver.setOnClickListener(v -> finish());
  
  // Obtener término de búsqueda
  String busqueda = getIntent().getStringExtra("busqueda");
  if (busqueda == null) busqueda = "";
  
  tituloResultado.setText("Resultados para: " + busqueda);
  
  // Buscar y mostrar
  List<LocationData.Ubicacion> resultados =
  LocationData.buscarUbicacion(busqueda);
  mostrarResultados(resultados);
}
```
2. mostrarResultados(List<Ubicacion> resultados)

java

```
private void mostrarResultados(List<LocationData.Ubicacion> resultados) {
  resultadosContainer.removeAllViews();
  
  if (resultados.isEmpty()) {
    noResultadosText.setVisibility(View.VISIBLE);
    return;
  }
  
  noResultadosText.setVisibility(View.GONE);
  
    for (final LocationData.Ubicacion ubicacion : resultados) {
    View itemView = getLayoutInflater().inflate(
    R.layout.item_ubicacion,
    resultadosContainer,
    false
    );
    
    // Configurar textos
    TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
    TextView bloqueText = itemView.findViewById(R.id.bloqueUbicacion);
    TextView pisoText = itemView.findViewById(R.id.pisoUbicacion);
    TextView descripcionText = itemView.findViewById(R.id.descripcionUbicacion);
    TextView tipoIcon = itemView.findViewById(R.id.tipoIcon);
    
    nombreText.setText(ubicacion.nombre);
    bloqueText.setText("📍 " + ubicacion.bloque);
    pisoText.setText("🏢 " + ubicacion.piso);
    descripcionText.setText(ubicacion.descripcion);
    
    // Ícono según tipo
    switch (ubicacion.tipo) {
      case "aula": tipoIcon.setText("📚"); break;
      case "departamento": tipoIcon.setText("🏢"); break;
      case "servicio": tipoIcon.setText("🔧"); break;
      default: tipoIcon.setText("📍"); break;
    }
    
    // Click para ver detalles
    itemView.setOnClickListener(v -> {
      Intent intent = new Intent(ResultadoActivity.this, DetalleActivity.class);
      intent.putExtra("nombre", ubicacion.nombre);
      intent.putExtra("bloque", ubicacion.bloque);
      intent.putExtra("piso", ubicacion.piso);
      intent.putExtra("descripcion", ubicacion.descripcion);
      intent.putExtra("instrucciones", ubicacion.instrucciones);
      intent.putExtra("tipo", ubicacion.tipo);
      startActivity(intent);
    });
    
    resultadosContainer.addView(itemView);
  }
}
```
**¿Qué hace?**
- Limpia resultados anteriores
- Si no hay resultados, muestra mensaje
- Si hay resultados:
- Crea un item por cada ubicación encontrada
- Configura textos e íconos
- Agrega click listener para ver detalles
- Añade al contenedor

### 6.8 🗄️ LocationData.java

Tipo: Java

NO tiene layout (es solo lógica)

Propósito:
- Base de datos en memoria
- Almacenar todas las ubicaciones del campus
- Proveer métodos de búsqueda y filtrado

**Clase interna: Ubicacion**

java

```
public static class Ubicacion {
  public String nombre;       // "Aula 14A-201"
  public String bloque;       // "Bloque A"
  public String piso;         // "Primera Planta"
  public String descripcion;  // "Aula de clases"
  public String tipo;         // "aula", "departamento", "servicio"
  public String instrucciones; // Cómo llegar
  
  public Ubicacion(String nombre, String bloque, String piso,
  String descripcion, String tipo, String instrucciones) {
    this.nombre = nombre;
    this.bloque = bloque;
    this.piso = piso;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.instrucciones = instrucciones;
  }
}
```

Variables estáticas:

java

```
private static List<Ubicacion> ubicaciones;
static: Una sola instancia compartida por toda la app
Se inicializa la primera vez que se accede
```
**Métodos principales:**
1. obtenerTodasLasUbicaciones()

java

```
public static List<Ubicacion> obtenerTodasLasUbicaciones() {
  if (ubicaciones == null) {
    inicializarUbicaciones();
  }
  return ubicaciones;
}
```
¿Qué hace?
- Lazy initialization (inicializa solo cuando se necesita)
- Si ubicaciones es null, llama a inicializarUbicaciones()
- Retorna la lista completa

2. inicializarUbicaciones()

java
```
private static void inicializarUbicaciones() {
ubicaciones = new ArrayList<>();

// BLOQUE A - Primera Planta
ubicaciones.add(new Ubicacion(
"Aula 14A-201",
"Bloque A",
"Primera Planta",
"Aula de clases",
"aula",
"Primera planta del Bloque A..."
));

// ... más de 100 ubicaciones
}
```
¿Qué hace?
- Crea lista vacía
- Agrega todas las ubicaciones manualmente
- Incluye: aulas, laboratorios, departamentos, servicios

3. buscarUbicacion(String termino)

java
```
public static List<Ubicacion> buscarUbicacion(String termino) {
  List<Ubicacion> resultados = new ArrayList<>();
  String terminoLower = termino.toLowerCase();
  
  for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
    if (ubicacion.nombre.toLowerCase().contains(terminoLower) ||
    ubicacion.bloque.toLowerCase().contains(terminoLower) ||
    ubicacion.descripcion.toLowerCase().contains(terminoLower)) {
      resultados.add(ubicacion);
    }
  }
  return resultados;
}
```
¿Qué hace?
- Convierte término a minúsculas
- Recorre todas las ubicaciones
- Busca coincidencias en:
    - Nombre
    - Bloque
    - Descripción
- Retorna lista de coincidencias

4. **obtenerPorTipo(String tipo)**



java

```
public static List<Ubicacion> obtenerPorTipo(String tipo) {
  List<Ubicacion> resultados = new ArrayList<>();
  
  for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
    if (ubicacion.tipo.equals(tipo)) {
      resultados.add(ubicacion);
    }
  }
  
  return resultados;
}
```
¿Qué hace?
- Filtra ubicaciones por tipo
- Tipos válidos: "aula", "departamento", "servicio"
- Retorna lista filtrada

ob5. tenerPorBloque()

java

```
public static Map<String, List<Ubicacion>> obtenerPorBloque() {
  Map<String, List<Ubicacion>> bloques = new HashMap<>();
  
  for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
    if (!bloques.containsKey(ubicacion.bloque)) {
      bloques.put(ubicacion.bloque, new ArrayList<Ubicacion>());
    }
    bloques.get(ubicacion.bloque).add(ubicacion);
  }
  
  return bloques;
}
```

**¿Qué hace?**

- Agrupa ubicaciones por bloque
- Retorna Map donde:
- Key: nombre del bloque
- Value: lista de ubicaciones de ese bloque
---



## 7. LAYOUTS XML {#layouts}



### 7.1 activity_main.xml

**Usado por:** `MainActivity.kt`

**Estructura:**
```
ConstraintLayout (raíz)
├── LinearLayout (Header)
│   ├── TextView "Universidad de Guayaquil"
│   ├── TextView "Facultad de Ingeniería Industrial"
│   └── TextView "Campus Mapasingue"
├── CardView (Búsqueda)
│   └── LinearLayout
│       ├── TextView "¿Qué estás buscando?"
│       ├── EditText (Campo de búsqueda)
│       └── Button "BUSCAR"
├── TextView "Accesos Rápidos"
└── GridLayout (2 columnas)
├── CardView (Aulas)
├── CardView (Departamentos)
├── CardView (Bloques)
└── CardView (Mapa Campus)
```

**Características:**

- Header con gradiente azul
- GridLayout para cards en cuadrícula
- Cards con fondos degradados diferentes
- Elevación (sombras) para profundidad
---

### 7.2 activity_lista.xml
**Usado por:** `AulasActivity`, `BloquesActivity`, `DepartamentosActivity`

**Estructura:**

```
ConstraintLayout (raíz)
├── LinearLayout (Header)
│   ├── ImageButton (Volver)
│   └── TextView (Título dinámico)
└── ScrollView
└── LinearLayout (listaContainer)
└── [Items agregados dinámicamente]
```

**Características:**
- Layout reutilizable
- ScrollView para contenido desplazable
- Container dinámico para items
- Header con botón de volver
---

### 7.3 activity_resultado.xml
**Usado por:** `ResultadoActivity`

**Estructura:**
```
ConstraintLayout (raíz)
├── LinearLayout (Header)
│   ├── ImageButton (Volver)
│   └── TextView (Título con término de búsqueda)
└── ScrollView
└── LinearLayout
├── LinearLayout (resultadosContainer)
└── TextView (noResultadosText) - Oculto por defecto
```

**Características:**
- Similar a activity_lista.xml
- Mensaje de "sin resultados" que aparece/desaparece

### 7.4 activity_detalle.xml
**Usado por:** DetalleActivity

**Estructura:**
```
ConstraintLayout (raíz)
├── LinearLayout (Header)
│   ├── ImageButton (Volver)
│   └── TextView "Detalles de Ubicación"
└── ScrollView
└── LinearLayout
├── CardView (Información principal)
│   └── LinearLayout
│       ├── LinearLayout (Ícono + Nombre)
│       ├── View (Divider)
│       └── LinearLayout (Bloque, Piso, Descripción)
├── CardView (Instrucciones)
│   └── LinearLayout
│       ├── TextView "🗺️ Cómo Llegar"
│       └── TextView (Instrucciones detalladas)
└── CardView (Información útil)
└── LinearLayout
├── TextView "ℹ️ Información Útil"
└── TextViews con consejos
```

**Características:**
- 3 cards con información separada
- Fondo azul claro en card de instrucciones
- Espaciado generoso para legibilidad
- Divider para separar secciones

### 7.5 activity_mapa.xml
**Usado por:** `MapaActivity`

**Estructura:**

```
ConstraintLayout (raíz)
├── LinearLayout (Header)
│   ├── ImageButton (Volver)
│   └── TextView "Mapa del Campus"
├── PhotoView (Imagen satelital con zoom)
└── CardView (Instrucciones de uso)
└── LinearLayout
├── TextView "💡 Instrucciones"
└── TextView (Tips de uso)
```

**Características:**
- PhotoView ocupa la mayor parte de la pantalla
- Fondo negro para contraste con la imagen
- Card flotante con instrucciones en la parte inferior

### 7.6 item_ubicacion.xml
**Usado por:** Todos los listados (reutilizable)

**Estructura:**
```
CardView (raíz)
└── LinearLayout (horizontal)
├── TextView (Ícono del tipo)
└── LinearLayout (vertical)
├── TextView (Nombre)
├── TextView (Bloque con 📍)
├── TextView (Piso con 🏢)
└── TextView (Descripción)
```
Características:
- Layout inflable dinámicamente
- Ícono grande a la izquierda
- Información organizada verticalmente
- Fondo blanco con borde
- Sombra sutil

## 8. RECURSOS DRAWABLE {#drawable}

**¿Por qué usar drawables XML en lugar de imágenes?**

Ventajas:
- ✅ Escalables sin perder calidad
- ✅ Tamaño de archivo mucho menor
- ✅ Fáciles de editar (cambiar colores)
- ✅ No requieren múltiples resoluciones

##Tipos de drawables usados:

### 8.1 Shape con Solid (Color sólido)

```

xml

```

<shape>

<solid android:color="#1976D2"/>

<corners android:radius="8dp"/>

</shape>

Usos: button_background.xml, item_background.xml

### 8.2 Shape con Gradient (Degradado)



xml

```
<shape>
  <gradient
    android:startColor="#E3F2FD"
    android:endColor="#BBDEFB"
    android:angle="135"/>
  <corners android:radius="12dp"/>
</shape>
```
Usos: card_background_1 a 4, header_gradient.xml

### 8.3 Shape con Stroke (Borde)

xml

```
<shape>
  <solid android:color="#FFFFFF"/>
  <stroke android:color="#E0E0E0" android:width="1dp"/>
</shape>
```
Usos: item_background.xml, search_background.xml

**Atributos de Shape:**
- solid: Color de relleno
- gradient: Degradado de colores
    - startColor: Color inicial
    - endColor: Color final
    - angle: Dirección (0=izq a der, 90=abajo a arriba, 135=diagonal)
- corners: Bordes redondeados
    - radius: Radio de curvatura
- stroke: Borde
    - color: Color del borde
    - width: Grosor del borde



## 9. MÉTODOS PRINCIPALES {#metodos}

### 9.1 Métodos del ciclo de vida de Android

onCreate()

Cuándo se llama: Al crear la Activity por primera vez

**Qué hacer aquí:**
- ✅ setContentView() - Establecer layout
- ✅ findViewById() - Inicializar vistas
- ✅ setOnClickListener() - Configurar eventos
- ✅ Cargar datos iniciales

Ejemplo:

java
```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState); // Siempre llamar a super
  setContentView(R.layout.activity_main); // Establecer layout
  // Inicializar vistas y configurar
}
finish()
```
Qué hace: Cierra la Activity actual y vuelve a la anterior
Uso:

java
```
btnVolver.setOnClickListener(v -> finish());
```
### 9.2 Métodos de navegación
startActivity(Intent)

Qué hace: Inicia una nueva Activity
Ejemplo básico:

java
```
Intent intent = new Intent(this, AulasActivity.class);
startActivity(intent);
```
Con datos (extras):

java
```
Intent intent = new Intent(this, DetalleActivity.class);
intent.putExtra("nombre", "Aula 14A-201");
intent.putExtra("bloque", "Bloque A");
startActivity(intent);
```
getIntent() y getStringExtra()

Qué hace: Obtiene datos pasados de otra Activity

Ejemplo:

java
```
String nombre = getIntent().getStringExtra("nombre");
if (nombre == null) nombre = ""; // Validar null
```
### 9.3 Métodos de vistas
**findViewById()**

Qué hace: Encuentra una vista por su ID

Ejemplo:

java
```
TextView titulo = findViewById(R.id.tituloLista);
setText()
```
Qué hace: Establece texto en un TextView

Ejemplo:

java
```
titulo.setText("Aulas");
setOnClickListener()
```
Qué hace: Configura acción al tocar un elemento

Java tradicional:

java
```
button.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    // Acción
  }
});
```
Java con lambda:
java

```
button.setOnClickListener(v -> {
  // Acción
});
```
Kotlin:

kotlin
```
button.setOnClickListener {
  // Acción
}
```
### 9.4 Métodos de layout dinámico

getLayoutInflater().inflate()

Qué hace: Convierte XML a objetos View

Ejemplo:

java
```
View itemView = getLayoutInflater().inflate(
  R.layout.item_ubicacion,  // XML a inflar
  aulasContainer,           // Padre (parent)
  false                     // No adjuntar todavía
);
```
**addView()**

Qué hace: Agrega una vista a un contenedor

Ejemplo:

java
```
aulasContainer.addView(itemView);
```
**removeAllViews()**

Qué hace: Elimina todas las vistas hijas
Ejemplo:

java

```
resultadosContainer.removeAllViews(); // Limpiar antes de mostrar nuevos resultados
```

### 9.5 Métodos de visibilidad

**setVisibility()**
Qué hace: Muestra u oculta elementos

Opciones:
- View.VISIBLE - Visible
- View.GONE - Invisible y no ocupa espacio
- View.INVISIBLE - Invisible pero ocupa espacio

Ejemplo:

java
```
if (resultados.isEmpty()) {
  noResultadosText.setVisibility(View.VISIBLE);
} else {
  noResultadosText.setVisibility(View.GONE);
}
```

### 9.6 Métodos de Toast
**Toast.makeText().show()**

Qué hace: Muestra mensaje temporal en pantalla

Ejemplo:


java
```
Toast.makeText(
  this,                              // Contexto
  "Por favor ingresa algo",          // Mensaje
  Toast.LENGTH_SHORT                 // Duración
).show();
```

**Duraciones:**

- `Toast.LENGTH_SHORT` - 2 segundos

- `Toast.LENGTH_LONG` - 3.5 segundos


## 10. FLUJO DE NAVEGACIÓN {#flujo}

### Mapa de navegación:

```
MainActivity (Pantalla principal)
├─→ ResultadoActivity (Búsqueda)
│   └─→ DetalleActivity (Detalles)
├─→ AulasActivity (Lista de aulas)
│   └─→ DetalleActivity (Detalles)
├─→ DepartamentosActivity (Departamentos)
│   └─→ DetalleActivity (Detalles)
├─→ BloquesActivity (Lista de bloques)
└─→ MapaActivity (Mapa campus)
```
###Flujo detallado:
1. Usuario abre la app
- Se muestra MainActivity
- Ve 4 opciones de acceso rápido
- Ve campo de búsqueda

2. Usuario busca "Laboratorio"
- Escribe en EditText
- Presiona botón "BUSCAR"
- Se ejecuta realizarBusqueda()
- Se crea Intent con el término
- Se abre ResultadoActivity

3. ResultadoActivity muestra resultados
- Recibe término de búsqueda
- Llama a LocationData.buscarUbicacion()
- Muestra lista de coincidencias
- Usuario toca un resultado

4. Se abre DetalleActivity
- Recibe datos de la ubicación
- Muestra información completa
- Muestra instrucciones de cómo llegar
- Usuario presiona "Volver"

5. Vuelta a ResultadoActivity
- Usuario puede ver otros resultados
- O volver a MainActivity

###Navegación alternativa:

**Desde MainActivity → AulasActivity:**

java

```
aulasCard.setOnClickListener {
  val intent = Intent(this, AulasActivity::class.java)
  startActivity(intent)
}
```
**AulasActivity carga datos:**

java
```
List<Ubicacion> aulas = LocationData.obtenerPorTipo("aula");
// Muestra lista
```
Usuario toca un aula → DetalleActivity:


java

```
itemView.setOnClickListener(v -> {
  Intent intent = new Intent(AulasActivity.this, DetalleActivity.class);
  intent.putExtra("nombre", aula.nombre);
  startActivity(intent);
});
```

# 🎯 CONCEPTOS CLAVE

**Intent**

Objeto que solicita una acción (como abrir otra Activity)

java

```
Intent intent = new Intent(OrigenActivity.this, DestinoActivity.class);
```
**Extra**

Datos adicionales que se pasan en un Intent

java

```
intent.putExtra("clave", "valor");
String valor = getIntent().getStringExtra("clave");
```
**ViewGroup**

Contenedor de otras vistas (LinearLayout, ConstraintLayout)

**View**

Elemento visual individual (TextView, Button, ImageView)

**Context**

Referencia al estado actual de la aplicación

- En Activity: this
- Para otras clases: se pasa como parámetro

**Listener**

Interfaz que escucha eventos (clicks, cambios de texto)

**Inflate**
Convertir XML en objetos View en memoria

**RecyclerView vs LinearLayout dinámico**
- RecyclerView: Para listas largas, reutiliza vistas (más eficiente)
- LinearLayout dinámico: Para listas cortas (más simple)
- Este proyecto usa LinearLayout dinámico por simplicidad



