package use_case.clear_users;

// TODO Complete me

import entity.UserFactory;
import use_case.signup.SignupInputData;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupUserDataAccessInterface;

public class ClearInteractor implements ClearInputBoundary{
    // new DAO
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;


    public ClearInteractor(ClearUserDataAccessInterface ClearDataAccessInterface, ClearOutputBoundary ClearOutputBoundary, UserFactory userFactory) {
        this.userDataAccessObject = ClearDataAccessInterface;
        this.userPresenter = ClearOutputBoundary;
        this.userFactory = userFactory;
    }

    public void execute() {
        userDataAccessObject.clear();
    }
}
