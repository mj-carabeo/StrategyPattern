class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String type) {
        this.type = type;
        // Initialize default strategies based on character type
        if (type.equals("Knight")) {
            attackStrategy = new SwingSwordAttack();
            defenseStrategy = new ShieldDefense();
        } else if (type.equals("Wizard")) {
            attackStrategy = new CastSpellAttack();
            defenseStrategy = new CreateMagicDefense();
        } else if (type.equals("Archer")) {
            attackStrategy = new ShootArrowAttack();
            defenseStrategy = new DodgeDefense();
        }
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }
}
