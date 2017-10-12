class MilesTest {

    static class Miles {
        private int hr;

        Miles(int hunger) {
            hr = hunger;
        }

        public void eat(Food p) {
            hr -= p.nt;
        }
    }

    static class Food {
        private int nt;

        Food(int nutrients) {
            nt = nutrients;
        }
    }

    public static void main(String[] args) {
        Miles s = new Miles(1);
        Food n = new Food(1);
        System.out.println(s.hr);
        s.eat(n);
        System.out.println(s.hr);
    }
}
