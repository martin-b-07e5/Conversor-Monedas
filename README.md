# 💱 **Conversor de Monedas** 🌍

¡Bienvenido al **Conversor de Monedas**! Esta aplicación, desarrollada en **Java**, te permite convertir entre varias monedas de forma rápida y sencilla.

Con la ayuda de la librería **Gson** y la API **[ExchangeRate-API]**, obtendrás tasas de cambio actualizadas al instante.
[ExchangeRate-API]:https://app.exchangerate-api.com/dashboard
---

## 🪙 **Monedas Soportadas**

El conversor permite la conversión entre las siguientes monedas:

- 🇦🇷 **ARS** - Peso argentino
- 🇧🇴 **BOB** - Boliviano boliviano
- 🇧🇷 **BRL** - Real brasileño
- 🇨🇱 **CLP** - Peso chileno
- 🇨🇴 **COP** - Peso colombiano
- 🇺🇸 **USD** - Dólar estadounidense

---

## 🛠️ **Tecnologías Utilizadas**

- **Java**: Lenguaje principal para el desarrollo de la aplicación.
- **Gson**: Librería para manipulación de JSON en Java.
- **ExchangeRate-API**: API para obtener tasas de cambio en tiempo real.

---

## ⚙️ **Requisitos Previos**

Antes de ejecutar el proyecto, asegúrate de tener instalados:

- ☕ **JDK 21**
- 🖥️ **IntelliJ IDEA** (recomendado para el desarrollo)
- 🌐 **Conexión a Internet** (para acceder a las tasas de cambio)

---

## 🚀 **Instrucciones para Ejecutar**

Sigue estos pasos para ejecutar el conversor de monedas en tu máquina local:

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/usuario/conversor-de-monedas.git
   ```

2. **Accede al directorio del proyecto:**

   ```bash
   cd conversor-de-monedas
   ```

3. **Ejecuta la aplicación:**

   ```bash
   java -jar target/conversor-de-monedas.jar
   ```

---

## 🔄 **Funcionamiento**

La aplicación solicita una cantidad y las monedas de origen y destino.<br>
Utiliza la API **ExchangeRate-API** para obtener la tasa de conversión más reciente y, con la ayuda de **Gson**, procesa la información en formato JSON.<br>
La conversión se realiza de manera eficiente, brindando resultados precisos y rápidos.

---

## 📝 **Licencia**

<!-- Este proyecto está licenciado bajo los términos de la [GPLv3]
[GPLv3]: https://www.gnu.org/licenses/quick-guide-gplv3.html -->

Este proyecto está licenciado bajo los términos de la <a href="https://www.gnu.org/licenses/quick-guide-gplv3.html" target="_blank">GPLv3</a>

---

## 📢 **Contribuciones**

Las contribuciones son bienvenidas.<br>
Si deseas colaborar, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz un commit (`git commit -m 'Agrega una nueva característica'`).
4. Envía tus cambios a tu fork (`git push origin feature/nueva-caracteristica`).
5. Abre un pull request.

---

🙌¡Gracias por usar el **Conversor de Monedas**! <br>
🤔Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue.
