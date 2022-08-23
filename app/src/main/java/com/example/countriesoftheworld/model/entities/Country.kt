package com.example.countriesoftheworld.model.entities

data class Country(
    val capital: List<String>,
    val currencies: Currencies,
    val flag: String,
    val flags: Flags,
    val languages: Languages,
    val population: Int,
    val region: String,
)

data class Currencies(
    val AED: AED,
    val AFN: AFN,
    val ALL: ALL,
    val AMD: AMD,
    val ANG: ANG,
    val AOA: AOA,
    val ARS: ARS,
    val AUD: AUD,
    val AWG: AWG,
    val AZN: AZN,
    val BAM: BAM,
    val BBD: BBD,
    val BDT: BDT,
    val BGN: BGN,
    val BHD: BHD,
    val BIF: BIF,
    val BMD: BMD,
    val BND: BND,
    val BOB: BOB,
    val BRL: BRL,
    val BSD: BSD,
    val BTN: BTN,
    val BWP: BWP,
    val BYN: BYN,
    val BZD: BZD,
    val CAD: CAD,
    val CDF: CDF,
    val CHF: CHF,
    val CKD: CKD,
    val CLP: CLP,
    val CNY: CNY,
    val COP: COP,
    val CRC: CRC,
    val CUC: CUC,
    val CUP: CUP,
    val CVE: CVE,
    val CZK: CZK,
    val DJF: DJF,
    val DKK: DKK,
    val DOP: DOP,
    val DZD: DZD,
    val EGP: EGP,
    val ERN: ERN,
    val ETB: ETB,
    val EUR: EUR,
    val FJD: FJD,
    val FKP: FKP,
    val FOK: FOK,
    val GBP: GBP,
    val GEL: GEL,
    val GGP: GGP,
    val GHS: GHS,
    val GIP: GIP,
    val GMD: GMD,
    val GNF: GNF,
    val GTQ: GTQ,
    val GYD: GYD,
    val HKD: HKD,
    val HNL: HNL,
    val HRK: HRK,
    val HTG: HTG,
    val HUF: HUF,
    val IDR: IDR,
    val ILS: ILS,
    val IMP: IMP,
    val INR: INR,
    val IQD: IQD,
    val IRR: IRR,
    val ISK: ISK,
    val JEP: JEP,
    val JMD: JMD,
    val JOD: JOD,
    val JPY: JPY,
    val KES: KES,
    val KGS: KGS,
    val KHR: KHR,
    val KID: KID,
    val KMF: KMF,
    val KPW: KPW,
    val KRW: KRW,
    val KWD: KWD,
    val KYD: KYD,
    val KZT: KZT,
    val LAK: LAK,
    val LBP: LBP,
    val LKR: LKR,
    val LRD: LRD,
    val LSL: LSL,
    val LYD: LYD,
    val MAD: MAD,
    val MDL: MDL,
    val MGA: MGA,
    val MKD: MKD,
    val MMK: MMK,
    val MNT: MNT,
    val MOP: MOP,
    val MRU: MRU,
    val MUR: MUR,
    val MVR: MVR,
    val MWK: MWK,
    val MXN: MXN,
    val MYR: MYR,
    val MZN: MZN,
    val NAD: NAD,
    val NGN: NGN,
    val NIO: NIO,
    val NOK: NOK,
    val NPR: NPR,
    val NZD: NZD,
    val OMR: OMR,
    val PAB: PAB,
    val PEN: PEN,
    val PGK: PGK,
    val PHP: PHP,
    val PKR: PKR,
    val PLN: PLN,
    val PYG: PYG,
    val QAR: QAR,
    val RON: RON,
    val RSD: RSD,
    val RUB: RUB,
    val RWF: RWF,
    val SAR: SAR,
    val SBD: SBD,
    val SCR: SCR,
    val SDG: SDG,
    val SEK: SEK,
    val SGD: SGD,
    val SHP: SHP,
    val SLL: SLL,
    val SOS: SOS,
    val SRD: SRD,
    val SSP: SSP,
    val STN: STN,
    val SYP: SYP,
    val SZL: SZL,
    val THB: THB,
    val TJS: TJS,
    val TMT: TMT,
    val TND: TND,
    val TOP: TOP,
    val TRY: TRY,
    val TTD: TTD,
    val TVD: TVD,
    val TWD: TWD,
    val TZS: TZS,
    val UAH: UAH,
    val UGX: UGX,
    val USD: USD,
    val UYU: UYU,
    val UZS: UZS,
    val VES: VES,
    val VND: VND,
    val VUV: VUV,
    val WST: WST,
    val XAF: XAF,
    val XCD: XCD,
    val XOF: XOF,
    val XPF: XPF,
    val YER: YER,
    val ZAR: ZAR,
    val ZMW: ZMW,
    val ZWL: ZWL
)

data class Flags(
    val png: String,
    val svg: String
)

data class Languages(
    val afr: String,
    val amh: String,
    val ara: String,
    val arc: String,
    val aym: String,
    val aze: String,
    val bar: String,
    val bel: String,
    val ben: String,
    val ber: String,
    val bis: String,
    val bjz: String,
    val bos: String,
    val bul: String,
    val bwg: String,
    val cal: String,
    val cat: String,
    val ces: String,
    val cha: String,
    val ckb: String,
    val cnr: String,
    val crs: String,
    val dan: String,
    val deu: String,
    val div: String,
    val dzo: String,
    val ell: String,
    val eng: String,
    val est: String,
    val fao: String,
    val fas: String,
    val fij: String,
    val fil: String,
    val fin: String,
    val fra: String,
    val gil: String,
    val gle: String,
    val glv: String,
    val grn: String,
    val gsw: String,
    val hat: String,
    val heb: String,
    val her: String,
    val hgm: String,
    val hif: String,
    val hin: String,
    val hmo: String,
    val hrv: String,
    val hun: String,
    val hye: String,
    val ind: String,
    val isl: String,
    val ita: String,
    val jam: String,
    val jpn: String,
    val kal: String,
    val kat: String,
    val kaz: String,
    val kck: String,
    val khi: String,
    val khm: String,
    val kin: String,
    val kir: String,
    val kon: String,
    val kor: String,
    val kwn: String,
    val lao: String,
    val lat: String,
    val lav: String,
    val lin: String,
    val lit: String,
    val loz: String,
    val ltz: String,
    val lua: String,
    val mah: String,
    val mey: String,
    val mfe: String,
    val mkd: String,
    val mlg: String,
    val mlt: String,
    val mon: String,
    val mri: String,
    val msa: String,
    val mya: String,
    val nau: String,
    val nbl: String,
    val ndc: String,
    val nde: String,
    val ndo: String,
    val nep: String,
    val nfr: String,
    val niu: String,
    val nld: String,
    val nno: String,
    val nob: String,
    val nor: String,
    val nrf: String,
    val nso: String,
    val nya: String,
    val nzs: String,
    val pap: String,
    val pau: String,
    val pih: String,
    val pol: String,
    val por: String,
    val pov: String,
    val prs: String,
    val pus: String,
    val que: String,
    val rar: String,
    val roh: String,
    val ron: String,
    val run: String,
    val rus: String,
    val sag: String,
    val sin: String,
    val slk: String,
    val slv: String,
    val smi: String,
    val smo: String,
    val sna: String,
    val som: String,
    val sot: String,
    val spa: String,
    val sqi: String,
    val srp: String,
    val ssw: String,
    val swa: String,
    val swe: String,
    val tam: String,
    val tet: String,
    val tgk: String,
    val tha: String,
    val tir: String,
    val tkl: String,
    val toi: String,
    val ton: String,
    val tpi: String,
    val tsn: String,
    val tso: String,
    val tuk: String,
    val tur: String,
    val tvl: String,
    val ukr: String,
    val urd: String,
    val uzb: String,
    val ven: String,
    val vie: String,
    val xho: String,
    val zdj: String,
    val zho: String,
    val zib: String,
    val zul: String
)

data class AED(
    val name: String,
    val symbol: String
)

data class AFN(
    val name: String,
    val symbol: String
)

data class ALL(
    val name: String,
    val symbol: String
)

data class AMD(
    val name: String,
    val symbol: String
)

data class ANG(
    val name: String,
    val symbol: String
)

data class AOA(
    val name: String,
    val symbol: String
)

data class ARS(
    val name: String,
    val symbol: String
)

data class AUD(
    val name: String,
    val symbol: String
)

data class AWG(
    val name: String,
    val symbol: String
)

data class AZN(
    val name: String,
    val symbol: String
)

data class BAM(
    val name: String
)

data class BBD(
    val name: String,
    val symbol: String
)

data class BDT(
    val name: String,
    val symbol: String
)

data class BGN(
    val name: String,
    val symbol: String
)

data class BHD(
    val name: String,
    val symbol: String
)

data class BIF(
    val name: String,
    val symbol: String
)

data class BMD(
    val name: String,
    val symbol: String
)

data class BND(
    val name: String,
    val symbol: String
)

data class BOB(
    val name: String,
    val symbol: String
)

data class BRL(
    val name: String,
    val symbol: String
)

data class BSD(
    val name: String,
    val symbol: String
)

data class BTN(
    val name: String,
    val symbol: String
)

data class BWP(
    val name: String,
    val symbol: String
)

data class BYN(
    val name: String,
    val symbol: String
)

data class BZD(
    val name: String,
    val symbol: String
)

data class CAD(
    val name: String,
    val symbol: String
)

data class CDF(
    val name: String,
    val symbol: String
)

data class CHF(
    val name: String,
    val symbol: String
)

data class CKD(
    val name: String,
    val symbol: String
)

data class CLP(
    val name: String,
    val symbol: String
)

data class CNY(
    val name: String,
    val symbol: String
)

data class COP(
    val name: String,
    val symbol: String
)

data class CRC(
    val name: String,
    val symbol: String
)

data class CUC(
    val name: String,
    val symbol: String
)

data class CUP(
    val name: String,
    val symbol: String
)

data class CVE(
    val name: String,
    val symbol: String
)

data class CZK(
    val name: String,
    val symbol: String
)

data class DJF(
    val name: String,
    val symbol: String
)

data class DKK(
    val name: String,
    val symbol: String
)

data class DOP(
    val name: String,
    val symbol: String
)

data class DZD(
    val name: String,
    val symbol: String
)

data class EGP(
    val name: String,
    val symbol: String
)

data class ERN(
    val name: String,
    val symbol: String
)

data class ETB(
    val name: String,
    val symbol: String
)

data class EUR(
    val name: String,
    val symbol: String
)

data class FJD(
    val name: String,
    val symbol: String
)

data class FKP(
    val name: String,
    val symbol: String
)

data class FOK(
    val name: String,
    val symbol: String
)

data class GBP(
    val name: String,
    val symbol: String
)

data class GEL(
    val name: String,
    val symbol: String
)

data class GGP(
    val name: String,
    val symbol: String
)

data class GHS(
    val name: String,
    val symbol: String
)

data class GIP(
    val name: String,
    val symbol: String
)

data class GMD(
    val name: String,
    val symbol: String
)

data class GNF(
    val name: String,
    val symbol: String
)

data class GTQ(
    val name: String,
    val symbol: String
)

data class GYD(
    val name: String,
    val symbol: String
)

data class HKD(
    val name: String,
    val symbol: String
)

data class HNL(
    val name: String,
    val symbol: String
)

data class HRK(
    val name: String,
    val symbol: String
)

data class HTG(
    val name: String,
    val symbol: String
)

data class HUF(
    val name: String,
    val symbol: String
)

data class IDR(
    val name: String,
    val symbol: String
)

data class ILS(
    val name: String,
    val symbol: String
)

data class IMP(
    val name: String,
    val symbol: String
)

data class INR(
    val name: String,
    val symbol: String
)

data class IQD(
    val name: String,
    val symbol: String
)

data class IRR(
    val name: String,
    val symbol: String
)

data class ISK(
    val name: String,
    val symbol: String
)

data class JEP(
    val name: String,
    val symbol: String
)

data class JMD(
    val name: String,
    val symbol: String
)

data class JOD(
    val name: String,
    val symbol: String
)

data class JPY(
    val name: String,
    val symbol: String
)

data class KES(
    val name: String,
    val symbol: String
)

data class KGS(
    val name: String,
    val symbol: String
)

data class KHR(
    val name: String,
    val symbol: String
)

data class KID(
    val name: String,
    val symbol: String
)

data class KMF(
    val name: String,
    val symbol: String
)

data class KPW(
    val name: String,
    val symbol: String
)

data class KRW(
    val name: String,
    val symbol: String
)

data class KWD(
    val name: String,
    val symbol: String
)

data class KYD(
    val name: String,
    val symbol: String
)

data class KZT(
    val name: String,
    val symbol: String
)

data class LAK(
    val name: String,
    val symbol: String
)

data class LBP(
    val name: String,
    val symbol: String
)

data class LKR(
    val name: String,
    val symbol: String
)

data class LRD(
    val name: String,
    val symbol: String
)

data class LSL(
    val name: String,
    val symbol: String
)

data class LYD(
    val name: String,
    val symbol: String
)

data class MAD(
    val name: String,
    val symbol: String
)

data class MDL(
    val name: String,
    val symbol: String
)

data class MGA(
    val name: String,
    val symbol: String
)

data class MKD(
    val name: String,
    val symbol: String
)

data class MMK(
    val name: String,
    val symbol: String
)

data class MNT(
    val name: String,
    val symbol: String
)

data class MOP(
    val name: String,
    val symbol: String
)

data class MRU(
    val name: String,
    val symbol: String
)

data class MUR(
    val name: String,
    val symbol: String
)

data class MVR(
    val name: String,
    val symbol: String
)

data class MWK(
    val name: String,
    val symbol: String
)

data class MXN(
    val name: String,
    val symbol: String
)

data class MYR(
    val name: String,
    val symbol: String
)

data class MZN(
    val name: String,
    val symbol: String
)

data class NAD(
    val name: String,
    val symbol: String
)

data class NGN(
    val name: String,
    val symbol: String
)

data class NIO(
    val name: String,
    val symbol: String
)

data class NOK(
    val name: String,
    val symbol: String
)

data class NPR(
    val name: String,
    val symbol: String
)

data class NZD(
    val name: String,
    val symbol: String
)

data class OMR(
    val name: String,
    val symbol: String
)

data class PAB(
    val name: String,
    val symbol: String
)

data class PEN(
    val name: String,
    val symbol: String
)

data class PGK(
    val name: String,
    val symbol: String
)

data class PHP(
    val name: String,
    val symbol: String
)

data class PKR(
    val name: String,
    val symbol: String
)

data class PLN(
    val name: String,
    val symbol: String
)

data class PYG(
    val name: String,
    val symbol: String
)

data class QAR(
    val name: String,
    val symbol: String
)

data class RON(
    val name: String,
    val symbol: String
)

data class RSD(
    val name: String,
    val symbol: String
)

data class RUB(
    val name: String,
    val symbol: String
)

data class RWF(
    val name: String,
    val symbol: String
)

data class SAR(
    val name: String,
    val symbol: String
)

data class SBD(
    val name: String,
    val symbol: String
)

data class SCR(
    val name: String,
    val symbol: String
)

data class SDG(
    val name: String
)

data class SEK(
    val name: String,
    val symbol: String
)

data class SGD(
    val name: String,
    val symbol: String
)

data class SHP(
    val name: String,
    val symbol: String
)

data class SLL(
    val name: String,
    val symbol: String
)

data class SOS(
    val name: String,
    val symbol: String
)

data class SRD(
    val name: String,
    val symbol: String
)

data class SSP(
    val name: String,
    val symbol: String
)

data class STN(
    val name: String,
    val symbol: String
)

data class SYP(
    val name: String,
    val symbol: String
)

data class SZL(
    val name: String,
    val symbol: String
)

data class THB(
    val name: String,
    val symbol: String
)

data class TJS(
    val name: String,
    val symbol: String
)

data class TMT(
    val name: String,
    val symbol: String
)

data class TND(
    val name: String,
    val symbol: String
)

data class TOP(
    val name: String,
    val symbol: String
)

data class TRY(
    val name: String,
    val symbol: String
)

data class TTD(
    val name: String,
    val symbol: String
)

data class TVD(
    val name: String,
    val symbol: String
)

data class TWD(
    val name: String,
    val symbol: String
)

data class TZS(
    val name: String,
    val symbol: String
)

data class UAH(
    val name: String,
    val symbol: String
)

data class UGX(
    val name: String,
    val symbol: String
)

data class USD(
    val name: String,
    val symbol: String
)

data class UYU(
    val name: String,
    val symbol: String
)

data class UZS(
    val name: String,
    val symbol: String
)

data class VES(
    val name: String,
    val symbol: String
)

data class VND(
    val name: String,
    val symbol: String
)

data class VUV(
    val name: String,
    val symbol: String
)

data class WST(
    val name: String,
    val symbol: String
)

data class XAF(
    val name: String,
    val symbol: String
)

data class XCD(
    val name: String,
    val symbol: String
)

data class XOF(
    val name: String,
    val symbol: String
)

data class XPF(
    val name: String,
    val symbol: String
)

data class YER(
    val name: String,
    val symbol: String
)

data class ZAR(
    val name: String,
    val symbol: String
)

data class ZMW(
    val name: String,
    val symbol: String
)

data class ZWL(
    val name: String,
    val symbol: String
)