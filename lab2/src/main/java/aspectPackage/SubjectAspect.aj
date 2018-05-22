package aspectPackage;

public aspect SubjectAspect {

    after() returning : call(* entity.ObservableOrSubject.update(..)){
        System.out.println("An update was made!");
    }
}
