package emu.grasscutter.game.quest.content;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_ENTER_MY_WORLD;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;

@QuestValueContent(QUEST_CONTENT_ENTER_MY_WORLD)
public class ContentEnterMyWorld extends BaseContent {
    // params[0] scene ID
    @Override
    public boolean execute(
            GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        System.out.printf("ContentEnterMyWorld, QuestData: %s; ExecParams: %s%n",
            condition.getParam()[0], params[0]);
        return quest.getOwner().getSceneId() == params[0];
    }
}
