package knight.imp1;

 import knight.Knight;
 import knight.Quest;

/**
 *@Description TODO
 *@date
 *@author
 */

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
         this.quest = quest;
     }

    public void embarkOnQuest() {
        quest.embark();
    }
}
