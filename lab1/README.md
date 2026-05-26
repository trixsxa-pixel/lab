# Лабораторная работа №1: Базовый синтаксис Java

Репозиторий содержит решения вводных задач по программированию на Java (изучение базового синтаксиса, циклов и работы со строками).

## Содержимое
* `JavaHelloWorldProgram.java` — вывод строки "Hello World" в консоль.
* `Primes.java` — поиск и вывод простых чисел в диапазоне от 2 до 100.
* `Palindrome.java` — проверка строк (аргументов командной строки) на палиндром.

## Запуск

Для работы требуется **JDK**. Компиляция и запуск выполняются через терминал:

```bash
# Hello World
javac JavaHelloWorldProgram.java && java JavaHelloWorldProgram

# Простые числа
javac Primes.java && java Primes

# Проверка палиндромов (передайте слова через пробел)
javac Palindrome.java && java Palindrome madam racecar apple
