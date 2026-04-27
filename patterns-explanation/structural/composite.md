# Patrón de Diseño: Composite

## 🎯 Propósito
**Composite** es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol para representar jerarquías de parte-todo. Este patrón permite a los clientes tratar de manera uniforme tanto a los objetos individuales como a las composiciones de los mismos.

## 🌧️ El Problema
Imagina que tienes dos tipos de objetos que interactúan entre sí: `Producto` y `Caja`. Una Caja puede contener varios Productos y también otras Cajas más pequeñas.

Si necesitas calcular el precio total de una Caja, sin aplicar este patrón tendrías que:
1. Recorrer la lista de productos directos y sumar su precio.
2. Recorrer la lista de sub-cajas y llamar recursivamente a su método de cálculo.

Esto hace que el cliente (o la propia caja) tenga que conocer la diferencia entre las clases concretas (`Producto` vs `Caja`) y tratar con listas separadas y lógicas condicionales. El código se vuelve rígido y difícil de extender si mañana añadimos un nuevo tipo de empaquetado (ej. `Sobre`).v

## 💡 La Solución
El patrón Composite sugiere que se defina una **interfaz común** (o clase abstracta) para todos los elementos del árbol, ya sean hojas (objetos simples) o ramas (compuestos).

Esta interfaz declara métodos que tienen sentido para todos, como `calcularPrecio()`.

### Estructura Clásica:
1. **Component (Componente):** La interfaz o clase abstracta común. Declara las operaciones comunes (ej. `DeliveryComponent`).
2. **Leaf (Hoja):** El elemento individual que no tiene sub-elementos (ej. `Product`). Realiza la mayor parte del trabajo real.
3. **Composite (Compuesto):** Un elemento que contiene sub-elementos (ej. `Box`). Delega el trabajo a sus sub-elementos, procesa los resultados y luego devuelve el resultado final al cliente.

Al implementar esto, la `Caja` pasa a contener una única lista genérica de `Component`. Al calcular el precio, la `Caja` simplemente itera sobre esa lista única, llamando a `calcularPrecio()` en cada elemento, sin importarle si es un producto simple u otra caja.

## ✅ Cuándo utilizarlo
- Cuando necesites representar jerarquías de objetos en forma de árbol (estructura parte-todo).
- Cuando quieras que el código cliente trate a los objetos simples y a los compuestos de forma exactamente igual.

## ⚖️ Pros y Contras
**Pros:**
- **Uniformidad:** Simplifica enormemente el código del cliente, ya que este trata a todos los elementos del árbol de la misma forma usando el polimorfismo.
- **Abierto/Cerrado (Open/Closed Principle):** Puedes introducir nuevos tipos de componentes (nuevas hojas o nuevos compuestos) sin romper el código existente, ya que funcionan a través de la misma interfaz.

**Contras:**
- **Sobregeneralización:** Puede ser difícil proporcionar una interfaz común si los componentes difieren demasiado entre sí. En algunos casos, te verás forzado a crear métodos sin sentido en las hojas (por ejemplo, un método `add()` en un `Producto` que devuelva una excepción).

## 💻 En nuestro código
En el ejercicio, tenemos:
- `DeliveryComponent` actúa como nuestro **Component**.
- `Product` es nuestra **Leaf** (hoja). Solo devuelve su precio.
- `Box` es nuestro **Composite** (compuesto). Delega el cálculo del precio a sus hijos (productos y otras cajas) que comparten la misma interfaz `DeliveryComponent`.
