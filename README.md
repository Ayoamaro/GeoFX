# GeoFX
Implementar en Java utilizando el framework **JavaFX** una aplicación que permita geolocalizar direcciones IP.

La interfaz de la aplicación será similar a la siguiente:

- Pestaña **Location**:

![](https://github.com/Ayoamaro/GeoFX/blob/main/docs/images/location-tab.png?raw=true)

- Pestaña **Connection**:

![](https://github.com/Ayoamaro/GeoFX/blob/main/docs/images/connection-tab.png?raw=true)

- Pestaña **Security**:

![](https://github.com/Ayoamaro/GeoFX/blob/main/docs/images/security-tab.png?raw=true)



Iconos utilizados: ![](https://github.com/Ayoamaro/GeoFX/blob/main/docs/images/icons-net.png?raw=true)

IMPORTANTE: hay que mantener la disposición de los elementos en la interfaz, pero no es necesario cuidar el aspecto (estilos).

Se deberá implementar siguiendo el patrón de diseño MVC.

Funcionalidad de la aplicación:

- Inicialmente se deberá mostrar nuestra IP actual (IP de salida a Internet, no la IP local) en el cuadro de texto superior.
- Se deberá poder introducir una dirección IP y pulsar el botón "Check IP", lo que provocará que se muestren los datos de geolocalización de la IP introducida (incluida la bandera del país).
- Para obtener la información de geolocalización se consumirá el servicio web [IPAPI](https://ipapi.com/).
- Para obtener nuestra dirección IP de salida a Internet se consumirá el servicio web [IPIFY](https://www.ipify.org/).

**NOTA: Podemos generar las clases Java que se van a mapear con el JSON desde [jsonschema2pojo](http://www.jsonschema2pojo.org/).**