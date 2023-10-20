package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.login.LoginInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearUseCaseInteractor;

    // constructor
    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    // there's no trace of data involved in the user interface, so in this case the
    // controller is not packaging any data and passing it through the input boundary
    public void execute() {

        clearUseCaseInteractor.execute();
    }
}
