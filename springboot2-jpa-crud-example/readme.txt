tâches a réalser
    Finaliser les services
        creer un service qui renvoie les equipes qui appel le service soap de equipe (getAllEquipe)
        remplacer les mock MockEquipe et MockEmployee  par des appel de services
        tu as du le remarquer mais l'insentiation des services soap n'est pa optimisé, optimise le

	Finaliser les methodes
		public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
		public Employee createEmployee(@Valid @RequestBody Employee employee) {
		public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
		public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
        public Map<String, Boolean> associeEmployeeEquipe(
			@PathVariable(value = "employeeId") Long employeeId,
			@PathVariable(value = "equipeId") Long equipeId) throws ResourceNotFoundException {


	Ajouter les endpoint:
	1)	/statistique/
		la statistique contient
		- le chiffre affaire total
		- le benefice total (affaire - salaire)
		- le chiffre affaire max (nom de l 'employee + montant)
		- le chiffre affaire  min  (nom de l 'employee + montant)
		- employee le plus rentable
		- employee les moins rentable (liste <nom de l 'employee + montant> des employe dont le benefice < benefice moyen )

	2) /prime/
		repartition d'une prime (en paramètre du endpoint) en fonction du bénefice des employee
		* employee les moins rentable n ont droit a aucune prime

		retourne
		- la liste des employe + montant de la prime a donner
		- la statistique recalculé en ajoutant a chaque employee le montant de la prime qui lui est dû


	3) /equipe/
		en entree liste des id employee + nom de l'equipe
		si l'equipe existe déjà alors on fusionne l'equipe existante et l'equipe en entree
		si un employe est deja dans une equipe alors on le retire de l'equipe existante

	4) /equipe/statistique/
		la statistique sur une équipe

	5) /equipe/prime/
		repartition d'une prime (en paramètre du endpoint) en fonction du bénefice des employee d'une equipe
