package hu.ltk.jakabgabor.parser;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.dto.RegistrationNumberRequestDTO;

public class RegistrationNumberParser {
    Gson gson = new Gson();

    public String parseRegistrationNumberToJson(String regNumber) {
        RegistrationNumberRequestDTO registrationNumberRequestDTO = new RegistrationNumberRequestDTO();
        registrationNumberRequestDTO.regNumber = regNumber;
        return gson.toJson(registrationNumberRequestDTO, RegistrationNumberRequestDTO.class);
    }
}
