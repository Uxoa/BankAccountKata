# Bank Account Kata

> El objetivo de esta kata es practicar los principios básicos de la OOP como: Abstración y Encapsulación usando TDD.
>

### ⚙️ Requisitos

Hay que usar TDD. Recuerda:

<aside>
🚧 **Test → Red → Green → Refactor 🔁**

</aside>

- No puedes escribir código sin un test que falle
- No puedes escribir nuevos tests que no fallen.
- Escribe siempre la solución más sencilla que haga pasar los tests. Refactoriza después.

---

### 👀 **Objetivo:**

- Desarrollar un sistema simple de gestión de cuentas bancarias que permita a los usuarios realizar operaciones básicas como depositar dinero, retirar dinero y consultar el saldo. Este ejercicio te ayudará a practicar la programación orientada a objetos (OOP), el manejo de estados, y el diseño de una API sencilla.

### 🏁 **Contexto:**

- Eres responsable de implementar la lógica para un sistema de gestión de cuentas bancarias. Los usuarios de este sistema deben poder crear cuentas, depositar dinero, retirar dinero y consultar el saldo actual de sus cuentas.

### 😮‍💨 **Requerimientos:**

1. **Crear una Cuenta:**
    - Cada cuenta debe tener un número de cuenta único y un saldo inicial.
    - El saldo inicial puede ser cero o una cantidad especificada durante la creación de la cuenta.
2. **Depositar Dinero:**
    - Los usuarios deben poder depositar una cantidad positiva de dinero en su cuenta.
    - Después de un depósito, el saldo de la cuenta debe incrementarse en la cantidad depositada.
3. **Retirar Dinero:**
    - Los usuarios deben poder retirar dinero de su cuenta.
    - El sistema debe verificar que la cuenta tenga suficientes fondos antes de permitir una retirada. Si no hay suficientes fondos, la transacción debe ser rechazada y el saldo no debe cambiar.
    - Después de una retirada exitosa, el saldo de la cuenta debe disminuir en la cantidad retirada.
4. **Consultar el Saldo:**
    - Los usuarios deben poder consultar el saldo actual de su cuenta en cualquier momento.
    - El saldo debe reflejar todas las operaciones anteriores (depósitos y retiradas).

**Reglas:**

- No se permite retirar más dinero del que hay disponible en la cuenta.
- El número de cuenta debe ser único para cada cuenta.
- Los depósitos y retiradas deben ser cantidades positivas.

**Ejemplo de Interacción:**

```

1. Crear una cuenta con un saldo inicial de $1000.
2. Depositar $500 en la cuenta.
3. Retirar $200 de la cuenta.
4. Consultar el saldo actual (debería ser $1300).
5. Intentar retirar $1500 (debe fallar porque el saldo disponible es $1300).
6. Consultar el saldo actual (debería seguir siendo $1300).
```

**Objetivos de la Kata:**

- Practicar la implementación de una lógica de negocio simple.
- Aprender a manejar estados de manera efectiva en un sistema orientado a objetos.
- Practicar el diseño y uso de métodos en una clase para gestionar una serie de operaciones de manera coherente.