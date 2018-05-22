package aspectPackage;

public aspect RepoAspect {

//    pointcut point_cut(): execution (*update(..));

    after() returning : call(* entity.ObservableOrSubject.update()){
        System.out.println("Pointcut: an update was made!");
    }


}
