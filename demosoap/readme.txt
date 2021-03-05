creer les services soap
        ResponseEquipes getAllEquipe()
        Equipes :
            Equipe 1 : employee id 1,2,3
            Equipe 2 : employee id 4,5,6
            Equipe 1 : employee id 7,8,9

		ResponseEmployee createEmployee(Employee employee) {
		ResponseEmployee updateEmployee( Long employeeId, Employee Employee)
		ResponseEmployees deleteEmployee(Long employeeId)
		ResponseEquipes associer( Long employeeId, Long equipeId)




QUESTIONS FABRICE:
	utilité d'une classe ResponseEmployee? c'est un Employee!
	je ne sais pas quand utiliser EmployeeDto et Employee! (EmployeeServiceImpl.creerEmployee: je convertis mon dto à employee pour le reconvertir après!)
	Je veux ne pas pouvoir créer un employee si l'id existe déjà. Pour l'instant je retourne null et postman me le dis. Y-a-t-il une meilleure façon de le faire?
	Je n'arrive pas à debugger Rest. On pourrait essayer avec createEmployee
	Debugger soap: log
	c'est normal qu'à chaque fois que je change demosoap j'ai les problèmes:
		pour importer les classes
		utf-8
	j'ai refactorisé la récupération de l'instance de demoSoapJava7 

QUESTIONS FABRICE:
	@Autowired dans EmployeeServiceImpl et EquipeServiceImpl me donne erreur lors du run: Consider defining a bean of type....
	Pour l'endpoint "statistique" je crée une classe Statistique?