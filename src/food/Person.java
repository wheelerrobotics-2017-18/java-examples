package food;

import food.Food;

public class Person {
    private float health=1;
    private float hunger=1;

    public void setHunger(float h) {
        if (h > 1) {
            hunger = 1;
        } else if (h < 0) {
            hunger = 0;
        } else {
            hunger = h;
        }
    }

    private void setHealth(float h) {
        if (h > 1) {
            health = 1;
        } else if (h < 0) {
            health = 0;
        } else {
            health = h;
        }
    }

    public void eat(Food f) {
        setHunger(f.getFp() + hunger);
    }

    public boolean isalive() {
        return health < 0;
    }
}
