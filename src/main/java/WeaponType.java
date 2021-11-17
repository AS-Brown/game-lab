public enum WeaponType {
    SWORD(10),
    AXE(20),
    SPEAR(20);

  private final int attackValue;

    WeaponType(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String stringify() {
        return this.toString();
    }
}
