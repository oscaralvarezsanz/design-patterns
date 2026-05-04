# Patrón de Diseño Facade (Estructural)

## Propósito
Proporciona una interfaz unificada y simplificada a un conjunto de interfaces en un subsistema. Facade define una interfaz de nivel superior que hace que el subsistema sea más fácil de usar, reduciendo la complejidad y el acoplamiento para el cliente.

## Cuándo usarlo
- Cuando quieres proporcionar una interfaz sencilla y directa a un subsistema complejo (una biblioteca, un framework, etc.).
- Cuando quieres estructurar un subsistema en capas. Puedes usar una fachada para definir un punto de entrada para cada nivel del subsistema.
- Cuando quieres reducir el acoplamiento entre múltiples clientes y las clases de los subsistemas.

## Ventajas
- **Aísla la complejidad:** Los clientes no necesitan conocer los detalles ni la estructura interna del subsistema.
- **Bajo acoplamiento:** Reduce drásticamente las dependencias directas entre el código del cliente y las partes individuales del subsistema, lo cual facilita la refactorización y los cambios en el futuro.
- **Puntos de entrada organizados:** Facilita la división de sistemas monolíticos en capas al requerir comunicación únicamente a través de la fachada.

## Desventajas
- **El objeto Dios (God Object):** La fachada puede llegar a convertirse en una clase "omnipotente" acoplada a todas las clases de la aplicación si no se diseña con cuidado.

## Estructura
1. **Facade (Fachada):** Conoce qué clases del subsistema son responsables de una petición en particular. Delega las peticiones del cliente a los objetos apropiados del subsistema.
2. **Subsystem classes (Clases del Subsistema):** Implementan la funcionalidad real del subsistema. Manejan el trabajo asignado por la fachada, pero no tienen conocimiento de ella (no mantienen referencias hacia la fachada).
3. **Client (Cliente):** Utiliza la fachada para interactuar con los subsistemas, en lugar de llamar directamente a las clases internas de estos.

## Ejemplo en el Mundo Real
Imagina un cine en casa (Home Theater). Para ver una película, necesitas bajar la pantalla, encender el proyector, encender el amplificador, configurar la entrada del amplificador al DVD, poner el volumen en nivel medio, encender el reproductor de DVD y darle a *play*.
En lugar de que el usuario haga esto manualmente paso por paso, un control remoto universal o asistente de voz actúa como **Facade** y ofrece un único botón o comando: "Modo Película". Internamente, esta fachada orquesta el encendido y configuración de todos los dispositivos.
