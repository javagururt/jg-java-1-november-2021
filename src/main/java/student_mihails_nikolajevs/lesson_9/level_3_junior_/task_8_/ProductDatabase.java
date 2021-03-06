package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_8_;

import teacher.annotations.CodeReview;

/*
Создайте реализацию следующего интерфейса.

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}

Класс должен называться InMemoryDatabase и хранить продукты в памяти
используя для этого массив.

Метод void save(Product product) должен добавлять новый продукт в массив.
Это можно сделать так:
- создаём новый массив длиннее предыдущего на 1;
- копируем все содержимое старого массива в новый;
- в последнюю ячейку нового массива сохраняем новый продукт.

Метод Product findByTitle(String productTitle) должен проходить
по массиву и находить первый встретившийся продукт с указанным
названием и возвращать его. Если продукт с указанным названием
не найден, то возвращать null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
 */
@CodeReview(approved = true)
public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);

    Product findByTitle(Product[] data, String productTitle);
}
