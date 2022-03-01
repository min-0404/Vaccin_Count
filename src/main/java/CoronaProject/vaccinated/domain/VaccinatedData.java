package CoronaProject.vaccinated.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class VaccinatedData {
    private int accumulatedFirstCnt;
    private int accumulatedSecondCnt;
    private int accumulatedThirdCnt;
    private String baseDate;
    private int firstCnt;
    private int id;
    private int secondCnt;
    private String sido;
    private int thirdCnt;
    private int totalFirstCnt;
    private int totalSecondCnt;
    private int totalThirdCnt;
}
