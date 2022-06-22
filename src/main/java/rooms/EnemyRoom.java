package rooms;

import characters.Enemy;

public class EnemyRoom extends Room {

    Enemy enemy;

    public EnemyRoom(String name) {
        super(name);
        this.enemy = new Enemy();
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
