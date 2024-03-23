import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.yandex.practikum.Account;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PracticumTest {

    @Test
    @Description("testCheckNameToEmboss_ValidName_ReturnsTrue")
    @DisplayName("NAME testCheckNameToEmboss_ValidName_ReturnsTrue")
    public void testCheckNameToEmboss_ValidName_ReturnsTrue() {
        // Arrange
        Account account = new Account("John Doe");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("NAME testCheckNameToEmboss_NameWithLessThanThreeCharacters_ReturnsFalse")

    @Description("testCheckNameToEmboss_NameWithLessThanThreeCharacters_ReturnsFalse")
    public void testCheckNameToEmboss_NameWithLessThanThreeCharacters_ReturnsFalse() {
        // Arrange
        Account account = new Account("Jo");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertFalse(result);
    }

    @Test
    @Description("testCheckNameToEmboss_NameWithMoreThanNineteenCharacters_ReturnsFalse")
    public void testCheckNameToEmboss_NameWithMoreThanNineteenCharacters_ReturnsFalse() {
        // Arrange
        Account account = new Account("VeryLongNameThatIsMoreThanNineteenCharacters");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertFalse(result);
    }

    @Test
    @Description("testCheckNameToEmboss_NameWithoutSpace_ReturnsFalse")
    public void testCheckNameToEmboss_NameWithoutSpace_ReturnsFalse() {
        // Arrange
        Account account = new Account("JohnDoe");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertFalse(result);
    }

    @Test
    @Description("testCheckNameToEmboss_NameStartsWithSpace_ReturnsFalse")
    public void testCheckNameToEmboss_NameStartsWithSpace_ReturnsFalse() {
        // Arrange
        Account account = new Account(" JohnDoe");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertFalse(result);
    }

    @Test
    @Description("testCheckNameToEmboss_NameEndsWithSpace_ReturnsFalse")
    public void testCheckNameToEmboss_NameEndsWithSpace_ReturnsFalse() {
        // Arrange
        Account account = new Account("JohnDoe ");

        // Act
        boolean result = account.checkNameToEmboss();

        // Assert
        assertFalse(result);
    }

}
