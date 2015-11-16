package training_codility
import dynamic._

class Test_number_solitaireSpec extends UnitSpec {
  "Codility example [1,-2,0,9,-1,-2]" should "give use 9" in {
    assert( NumberSolitaire.solution( Array(1,-2,0,9,-1,-2) ) === 8)
  }
  

}