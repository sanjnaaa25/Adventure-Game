package main;

import entity.Entity;
import object.*;

public class EntityGenerator {

    GamePanel gp;

    public EntityGenerator(GamePanel gp)
    {
        this.gp = gp;
    }

    public Entity getObject(String itemName)
    {
        Entity obj = null;

        switch (itemName)
        {


            case OBJ_Chest.objName: obj = new OBJ_Chest(gp);break;

            case OBJ_Door.objName: obj = new OBJ_Door(gp);break;

            case OBJ_Fireball.objName: obj = new OBJ_Fireball(gp);break;
            case OBJ_Heart.objName: obj = new OBJ_Heart(gp);break;
            case OBJ_Key.objName: obj = new OBJ_Key(gp);break;

            case OBJ_ManaCrystal.objName: obj = new OBJ_ManaCrystal(gp);break;


            case OBJ_Rock.objName: obj = new OBJ_Rock(gp);break;

            case OBJ_Shield_Wood.objName: obj = new OBJ_Shield_Wood(gp);break;
            case OBJ_Sword_Normal.objName: obj = new OBJ_Sword_Normal(gp);break;


        }
        return obj;
    }

}
