package ammonite.terminal

import utest._
import Console._

object PromptTests extends TestSuite{

  val tests = TestSuite{

    'test1 {
      val username = s"${BOLD}${YELLOW}username${RESET}"
      val directory = s"in ${BOLD}${REVERSED}${GREEN}${UNDERLINED}directory"
      val full = s"${username}${directory}\n${WHITE}@ "
      val prompt = Prompt(full)
      assert(prompt.full == full)
      assert(prompt.lastLine == s"${GREEN}${BOLD}${UNDERLINED}${REVERSED}${WHITE}@ ")
      assert(prompt.lastLineNoAnsi == "@ ")
    }
  }
}
