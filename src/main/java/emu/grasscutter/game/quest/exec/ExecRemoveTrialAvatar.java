package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_REMOVE_TRIAL_AVATAR)
public class ExecRemoveTrialAvatar extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        try {
            quest.getOwner().getTeamManager().removeTrialAvatar(Integer.parseInt(paramStr[0]));
            Grasscutter.getLogger()
                    .debug("Removed trial avatar from team for quest {}", quest.getSubQuestId());
            return true;
        } catch (RuntimeException exception) {
            exception.printStackTrace();
            return false;
        }
    }
}
