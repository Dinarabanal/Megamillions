package edu.cnm.deepdive.megamillions.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.megamillions.model.entity.PickNumber;
import java.util.List;

@Dao
public interface PickNumberDao {

  @Insert(onConflict = OnConflictStrategy.FAIL)
  List <Long> insert(List<PickNumber> numbers);

  @Query("SELECT * FROM PickNumber WHERE pick_id = :pickId ORDER BY pool, value")
  List<PickNumber> select(long pickId);

  @Delete
  int delete(List<PickNumber> number);


}
