package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3); // Rectangle-г Shape хэлбэрээр ашиглах
        Renderer renderer = new Renderer(shape);

        renderer.render();
    }
}
// Renderer нь зөвхөн Shape-оос хамаарах болсон → Rectangle-аас шууд хамааралгүй.
//Мэдээлэл нуух зарчим хэрэгжсэн → Renderer нь Rectangle-ийн дотоод өгөгдөлд шууд хандахгүй.
// Шинэ дүрсүүдийг нэмэхэд кодыг өөрчлөх шаардлагагүй → Shape интерфейс ашигласнаар өргөтгөх боломж нэмэгдсэн.
