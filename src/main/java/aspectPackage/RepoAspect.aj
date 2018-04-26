package aspectPackage;

public aspect RepoAspect {

    after() returning : call(* entity.ObservableOrSubject.update()){
        System.out.println("Pointcut: an update was made!");
    }


}
