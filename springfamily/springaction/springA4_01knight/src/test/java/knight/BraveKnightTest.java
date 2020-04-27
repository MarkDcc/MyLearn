package knight;

import knight.imp1.BraveKnight;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author
 * @Description TODO
 * @date
 */
public class BraveKnightTest {
    @Test
    public void knightShouldInvokeEmbark(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }

}
