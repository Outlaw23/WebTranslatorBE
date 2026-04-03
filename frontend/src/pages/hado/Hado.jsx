import { useState } from "react";
import { translateToHado } from "../../utils/hadoTranslator";
import "./Hado.css";

function Hado() {

    const [input, setInput] = useState("");
    const [output, setOutput] = useState("");

    const translate = () => {
        const result = translateToHado(input);
        setOutput(result);
    };



    return (

        <div className="hado-container">
            <h1>Hado</h1>

            <button className="translate-btn" onClick={translate}>
                Translate to hado
            </button>

            <textarea
                className="input-box"
                placeholder="Type text..."
                value={input}
                onChange={(e) => setInput(e.target.value)}
            />

            <textarea
                className="output-box"
                value={output}
                readOnly
            />

        </div>
    );
}

export default Hado;