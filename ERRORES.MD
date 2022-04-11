A continuación, se detallan los principios SOLID que no se cumplen en el programa:

•	Principio de Segregación de Interfaces: existe una única interfaz con muchos métodos, lo más apropiado es tener varias, puesto que no todas las clases usan todos esos métodos.
•	Principio Abierto Cerrado: no existe una interfaz estable, no todos los campos son privados con métodos para controlar dichos campos.
•	Principio de sustitución de Liskov: hay clases que lanzan excepciones más restrictivas que su clase padre.
•	Principio de responsabilidad única: Files hace funciones que se pueden dividir en una clase hija, como por ejemplo las conversiones de formatos de audio.
•	Principio de inversión de dependencias: ciertas clases (padre e hijas) e interfaces están en el mismo paquete, deberían estar separadas: abstracta e interfaces por un lado e hijas por otro.
