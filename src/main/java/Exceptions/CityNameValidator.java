package Exceptions;

import java.util.Set;

public class CityNameValidator {
    private final Set<String> cityDatabase;

    public CityNameValidator(Set<String> cityDatabase) {
        this.cityDatabase = cityDatabase;
    }

    public boolean isCityInDatabase(String city) {
        return cityDatabase.contains(city.toLowerCase());
    }

    public boolean isFirstLetterCorrect(String lastComputerCity, String inputCity) {
        char lastComputerCityChar = lastComputerCity.charAt(lastComputerCity.length() - 1);
        char firstInputChar = inputCity.charAt(0);
        return Character.toLowerCase(lastComputerCityChar) == Character.toLowerCase(firstInputChar);
    }

    public void checkLastLetterException(String cityName) throws CityNameException {
        cityName = cityName.toLowerCase();
        if (cityName.endsWith("ь") || cityName.endsWith("и") || cityName.endsWith("й")) {
            throw new CityNameException();
        }
    }
}