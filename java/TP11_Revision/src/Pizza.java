public class Pizza {
	private int taille; 
	private boolean fromage;
	private boolean pepperoni;
	private boolean olive;
	
    public static class Builder {
    	private int taille = -1; // obligatoire, pas de valeur par défaut
    	private boolean fromage = false;
    	private boolean pepperoni = false;
    	private boolean olive = false;

        public Builder(int taille) {
            this.taille = taille;
        }

        public Builder fromage(boolean f) {
            this.fromage = f;
            return this;
        }

        public Builder pepperoni(boolean p) {
            this.pepperoni = p;
            return this;
        }

        public Builder olive(boolean o) {
            this.olive = o;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder b) {
        this.taille = b.taille;
        this.fromage = b.fromage;
        this.pepperoni = b.pepperoni;
        this.olive = b.olive;
    }
}