class ConservacaoMarinha(
    var tipoAmbiente: String,
    var areaProtegidaKm2: Double,
    var possuiProgramaMonitoramento: Boolean
) {
    constructor() : this("", 0.0, false)

    fun obterTipoAmbiente(): String {
        return tipoAmbiente
    }

    fun obterAreaProtegidaKm2(): Double {
        return areaProtegidaKm2
    }

    fun possuiProgramaDeMonitoramento(): Boolean {
        return possuiProgramaMonitoramento
    }

    fun definirTipoAmbiente(tipoAmbiente: String) {
        this.tipoAmbiente = tipoAmbiente
    }

    fun definirAreaProtegidaKm2(areaProtegidaKm2: Double) {
        this.areaProtegidaKm2 = areaProtegidaKm2
    }

    fun definirPossuiProgramaMonitoramento(possuiProgramaMonitoramento: Boolean) {
        this.possuiProgramaMonitoramento = possuiProgramaMonitoramento
    }
}

fun main() {
    val conservacao = ConservacaoMarinha("Coral", 100.0, true)

    println("Tipo de Ambiente: ${conservacao.obterTipoAmbiente()}")
    println("Área Protegida: ${conservacao.obterAreaProtegidaKm2()} km²")
    println("Possui Monitoramento: ${if (conservacao.possuiProgramaDeMonitoramento()) "Sim" else "Não"}")
}
