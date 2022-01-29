package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Animal;

class Fish extends Animal {

    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    void breath() {
        System.out.println("Gills");
    }
}
