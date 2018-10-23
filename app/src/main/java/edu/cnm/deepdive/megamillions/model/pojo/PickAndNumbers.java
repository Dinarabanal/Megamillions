package edu.cnm.deepdive.megamillions.model.pojo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;
import edu.cnm.deepdive.megamillions.model.entity.Pick;
import edu.cnm.deepdive.megamillions.model.entity.PickNumber;
import java.util.List;

public class PickAndNumbers {

  @Embedded
  private Pick pick;

  @Relation(parentColumn = "pick_id", entityColumn = "pick_id")
  private List<PickNumber> number;

  public Pick getPick() {
    return pick;
  }

  public void setPick(Pick pick) {
    this.pick = pick;
  }

  public List<PickNumber> getNumber() {
    return number;
  }

  public void setNumber(List<PickNumber> number) {
    this.number = number;
  }
}
